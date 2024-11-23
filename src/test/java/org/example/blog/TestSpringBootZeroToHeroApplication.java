package org.example.blog;

import org.springframework.boot.SpringApplication;

public class TestSpringBootZeroToHeroApplication {

    public static void main(String[] args) {
        SpringApplication.from(SpringBootZeroToHeroApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
