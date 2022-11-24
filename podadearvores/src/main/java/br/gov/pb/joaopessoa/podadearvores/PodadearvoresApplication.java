package br.gov.pb.joaopessoa.podadearvores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class PodadearvoresApplication {

	public static void main(String[] args) {
		SpringApplication.run(PodadearvoresApplication.class, args);
	}

}
