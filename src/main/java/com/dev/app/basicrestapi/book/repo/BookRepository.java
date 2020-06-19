package com.dev.app.basicrestapi.book.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dev.app.basicrestapi.book.dao.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, String> {

}
