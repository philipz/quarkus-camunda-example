package org.acme;

import org.camunda.bpm.engine.delegate.DelegateExecution;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;

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
