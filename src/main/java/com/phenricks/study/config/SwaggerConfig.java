package com.phenricks.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Spring boot studies", version = "1.0.0"))
public class SwaggerConfig {

    @Bean
	public OpenAPI CustomOpenApiConfig() {
		return new OpenAPI().components(new Components());
    }
	
}
