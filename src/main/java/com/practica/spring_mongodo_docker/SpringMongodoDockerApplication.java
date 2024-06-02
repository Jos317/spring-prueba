package com.practica.spring_mongodo_docker;

import com.practica.spring_mongodo_docker.dao.BookRepository;
import com.practica.spring_mongodo_docker.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/book")
public class SpringMongodoDockerApplication {

	@Autowired
	private BookRepository repository;

	@PostMapping
	public Book saveBook(@RequestBody Book book){
		return repository.save(book);
	}

	public static void main(String[] args) {

		SpringApplication.run(SpringMongodoDockerApplication.class, args);
	}

}
