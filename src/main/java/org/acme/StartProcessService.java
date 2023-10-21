package org.acme;

import io.quarkus.runtime.StartupEvent;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstance;

import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class StartProcessService {

    @Inject
    RuntimeService runtimeService;

    public void startProcess(@Observes StartupEvent event) {
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("Process");
    }
}
