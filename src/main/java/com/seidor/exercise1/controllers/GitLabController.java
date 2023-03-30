package com.seidor.exercise1.controllers;

import com.seidor.exercise1.models.Project;
import com.seidor.exercise1.services.GitLabService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.IOException;

@RestController
@Api
@RequestMapping("/api")
@Validated
public class GitLabController {

    @Autowired
    private GitLabService gitLabService;

    @GetMapping("/repository/{nombre}")
    @ApiOperation( value ="Creates a new repository with 2 branches and one tag",
                    notes = "User can only define the name of the repo. Name should be between 1 - 15 chars",
                    response = Project.class)
    @ApiResponse(responseCode = "201", description = "Repository created successfully")
    public @ResponseBody ResponseEntity<Project> newRepository(
            @ApiParam(value = "Name for the new repository", required = true, allowEmptyValue = false, allowableValues = "range[1, 15]")
            @PathVariable @NotBlank @Size(max = 15) String nombre) {

        Project project;
        try {
            project = this.gitLabService.createRepository(nombre);

        } catch (ResponseStatusException statusException) {
            throw statusException;
        } catch (IOException ioException) {
            return ResponseEntity.internalServerError().body(null);
        } catch (InterruptedException interruptedException) {
            return ResponseEntity.badRequest().body(null);
        }

        return ResponseEntity.ok(project);
    }

}
