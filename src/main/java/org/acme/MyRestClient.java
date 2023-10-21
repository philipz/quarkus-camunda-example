package org.acme;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;

@RegisterRestClient(baseUri = "http://localhost:8080/hello")
public interface MyRestClient {

    @GET
    public String getHello();
}
