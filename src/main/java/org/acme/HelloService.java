package org.acme;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.Dependent;

@Dependent
public class HelloService {

    @RestClient
    MyRestClient client;

    public String sayHello() {
        return "hello";
    }
}
