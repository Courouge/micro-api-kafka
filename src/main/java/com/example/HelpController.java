package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/help")
public class HelpController {
    @Get
    @Produces(MediaType.TEXT_PLAIN)
    public String index() {
        return "Hello help";
    }
}
