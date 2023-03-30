package com.seidor.exercise1.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.seidor.exercise1.models.Converter;
import com.seidor.exercise1.models.Project;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.server.ResponseStatusException;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class GitLabServiceImplTest {

    @Autowired
    private GitLabService gitLabService;

    @Mock private HttpClient mockHttpClient;
    @Mock private HttpRequest mockHttpRequest;
    @Mock private HttpResponse mockHttpResponse;
    @Mock private ObjectMapper mockMapper;

    @Test
    void createRepository_success() {

        try {
            Project project = gitLabService.createRepository("test1");
            Assertions.assertNotNull(project);
            assertEquals("test1", project.getName());

        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    void createRepository_failNameRepeated() {
        try {
            ResponseStatusException exception = assertThrows(ResponseStatusException.class, () -> {
                gitLabService.createRepository("test1");
            });
            assertTrue(exception.getMessage().contains("Name already used"));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }
}