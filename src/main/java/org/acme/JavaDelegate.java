package org.acme;

import org.camunda.bpm.engine.delegate.DelegateExecution;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Dependent
@Named
public class JavaDelegate implements org.camunda.bpm.engine.delegate.JavaDelegate {

    @Inject
    HelloService helloService;

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("In Delegate " + delegateExecution.getActivityInstanceId());
        System.out.println(helloService.sayHello());
    }
}
