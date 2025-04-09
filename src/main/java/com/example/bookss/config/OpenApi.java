package com.example.bookss.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(info = @Info(title = "asdljhggasd", version = "6.0",
        description = "Bu kitab emeliyyati etmek uchun hazirlanib",
contact = @Contact(
        name = "Rena",
        url = "google.com",
        email = "rena@mail.ru"
)))

@Configuration
public class OpenApi {
}
