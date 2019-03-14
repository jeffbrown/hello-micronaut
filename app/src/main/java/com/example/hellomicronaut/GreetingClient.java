package com.example.hellomicronaut;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("https://mn-frontend-dot-oci-micronaut.appspot.com/")
public interface GreetingClient {

    @Get("/hello/{name}")
    String getGreeting(String name);
}
