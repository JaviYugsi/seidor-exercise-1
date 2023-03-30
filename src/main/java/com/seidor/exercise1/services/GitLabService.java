package com.seidor.exercise1.services;

import com.seidor.exercise1.models.Project;

import java.io.IOException;

public interface GitLabService {
    public void init();
    Project createRepository(String nombreRepo) throws IOException, InterruptedException;
}
