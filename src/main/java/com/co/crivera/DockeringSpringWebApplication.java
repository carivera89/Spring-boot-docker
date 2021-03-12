package com.co.crivera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockeringSpringWebApplication {

	public static void main(String[] args) {
	    System.setProperty("server.servlet.context-path", "/dockering-spring-web");
		SpringApplication.run(DockeringSpringWebApplication.class, args);
	}

}

