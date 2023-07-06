package com.nr.springbootcrudexample;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.annotations.OpenAPI30;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@OpenAPIDefinition(info = @Info(description = "SpringBoot Crud Application using MY SQL database ",title = "Spring Boot Crud Application",version = "1.0"))
@SpringBootApplication
public class SpringBootCrudExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudExampleApplication.class, args);
	}
  /*  @Bean
    public ApplicationRunner applicationRunner(@Value("${key-test}") String value) {
        return args->{
			System.out.println(value);
		};
    }
*/}
