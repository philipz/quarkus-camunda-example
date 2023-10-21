package org.acme;

import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.quarkus.engine.extension.event.CamundaEngineStartupEvent;

import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;

public class Deployments {


    @Inject
    RepositoryService repositoryService;


    public void performDeployment(@Observes CamundaEngineStartupEvent startupEvent) {
        repositoryService.createDeployment()
                .enableDuplicateFiltering(true)
                .addClasspathResource("workflow.bpmn")
                .deploy();

    }

}