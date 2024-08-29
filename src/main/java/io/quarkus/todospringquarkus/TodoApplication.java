package io.quarkus.todospringquarkus;

import io.micronaut.runtime.Micronaut;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		Micronaut.run(TodoApplication.class, args);
	}

}