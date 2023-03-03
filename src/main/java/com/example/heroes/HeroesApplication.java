package com.example.heroes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = {
        "com.example.heroes.controller",
        "com.example.heroes.service",
        "com.example.heroes.model",
        "com.example.heroes.config",
        "com.example.heroes.repository"
})
@EnableJpaRepositories("com.example.heroes.*")
@ComponentScan(basePackages = { "com.example.heroes.*" })
@EntityScan("com.example.heroes.*")

public class HeroesApplication {
    public static void main(String[] args) {
        SpringApplication.run(HeroesApplication.class, args);
    }
}
