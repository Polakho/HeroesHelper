package com.example.heroes;

import com.heroes.controller.IncidentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication(scanBasePackages = {
        "com.heroes.controller",
        "com.heroes.service",
        "com.heroes.model",
})
@EntityScan("com.heroes.model")
@EnableJpaRepositories("com.heroes.repository")

public class HeroesApplication {
    public static void main(String[] args) {
        SpringApplication.run(HeroesApplication.class, args);
    }
}
