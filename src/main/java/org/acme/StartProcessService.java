package org.acme;

import io.quarkus.runtime.StartupEvent;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstance;

import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class StartProcessService {

    @Inject
    RuntimeService runtimeService;

    public void startProcess(@Observes StartupEvent event) {
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("Process");
    }
}
