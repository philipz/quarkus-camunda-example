package org.acme;

import jakarta.enterprise.context.Dependent;

@Dependent
public class HelloService {

    public String sayHello() {
        return "hello";
    }
}
