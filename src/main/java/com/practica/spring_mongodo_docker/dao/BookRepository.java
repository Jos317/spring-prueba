package com.practica.spring_mongodo_docker.dao;

import com.practica.spring_mongodo_docker.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {
}
