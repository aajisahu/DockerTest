package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.docker")
@EnableJpaRepositories(basePackages = "com.docker.repository")
public class DockerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerTestApplication.class, args);
	}

}
