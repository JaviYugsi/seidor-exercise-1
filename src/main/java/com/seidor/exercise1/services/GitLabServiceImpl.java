package com.seidor.exercise1.services;

import com.seidor.exercise1.models.Converter;
import com.seidor.exercise1.models.Project;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;

@Service
public class GitLabServiceImpl implements GitLabService {

    private final int SUCCESSFUL_CREATION_CODE = 201;

    @Value("${private-token}")
    private String privateToken;

    @Value("${default-branch}")
    private String defaultBranch;

    @Value("${content-type}")
    private String contentType;

    @Value("${host}")
    private String host;

    @Value("${main-branch-name}")
    private String mainBranchName;

    @Value("${secondary-branch-name}")
    private String secondaryBranchName;

    @Value("${tag-name}")
    private String tagName;

    private final String TAIL = "api/v4/projects/";

    private String urlAPI;

    @PostConstruct
    public void init () {
        urlAPI = this.host.concat(TAIL);
    }

    @Override
    public Project createRepository(String nombreRepo) throws IOException, InterruptedException {

        //Necesito un map con el cuerpo de la request
        HashMap<String, String> mapBody = new HashMap<>();
        mapBody.put("name", nombreRepo);
        mapBody.put("description", nombreRepo + " description");
        mapBody.put("default_branch", mainBranchName);
        mapBody.put("initialize_with_readme", "true");
        mapBody.put("visibility", "public");

        // Utilizamos un object Mapper para obtener el string del body
        ObjectMapper mapper = new ObjectMapper();
        String body = mapper.writeValueAsString(mapBody);

        // Inicializamos el HttpClient
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlAPI))
                .header("PRIVATE-TOKEN", privateToken)
                .header("Content-Type", contentType)
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();

        //Almacenamos la respuesta y convertimos el objeto

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() != SUCCESSFUL_CREATION_CODE){
          throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "Name already used");
        }
        Project res = Converter.fromJsonString(response.body());

        //Llamamos a la creación de la rama
        response = createBranch(res, client);
        if (response.statusCode() != SUCCESSFUL_CREATION_CODE) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "Error on Branch creation");
        }
        //Llamamos a la creación del tag
        response = createTag(res, client);
        if (response.statusCode() != SUCCESSFUL_CREATION_CODE) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "Error on tag creation");
        }

        return res;
    }

    private HttpResponse createBranch(Project project, HttpClient client) throws IOException, InterruptedException {

        String tailRequest = urlAPI.concat(String.valueOf(project.getID()))
                .concat("/repository/branches?")
                .concat("branch=developer&")
                .concat("ref=master");

        // Inicializamos el HttpClient
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(tailRequest))
                .header("PRIVATE-TOKEN", privateToken)
                .header("Content-Type", contentType)
                .POST(HttpRequest.BodyPublishers.noBody())
                .build();

        //Ejecutamos llamada y devolvemos response.
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response;
    }

    private HttpResponse createTag(Project project, HttpClient client) throws IOException, InterruptedException {
        String tailRequest = urlAPI.concat(String.valueOf(project.getID()))
                .concat("/repository/tags?")
                .concat("tag_name=0.0.1&")
                .concat("ref=master");

        // Inicializamos el HttpClient
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(tailRequest))
                .header("PRIVATE-TOKEN", privateToken)
                .header("Content-Type", contentType)
                .POST(HttpRequest.BodyPublishers.noBody())
                .build();

        //Ejecutamos llamada y devolvemos response.
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response;
    }

}
