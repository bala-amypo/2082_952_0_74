package com.example.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                // You need to change the port as per your server
                .servers(List.of(
                        new Server().url("https://9005.vs.amypo.ai")
                ));
        }
}
import io.swagger v3 .as.model.open demo.config
import io.swagger.oas .model.Server .servers
impoer  io.swagger.v3.oas.model.server
import  io.swagger.v3.open ai swagger into .annotation 
Sservice .context annotation .configuration 
import org.springframework 