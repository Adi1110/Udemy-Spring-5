package com.spring.framework.Spring5Udemy.repository;

import com.spring.framework.Spring5Udemy.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
