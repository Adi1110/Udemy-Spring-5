package com.spring.framework.Spring5Udemy.repository;

import com.spring.framework.Spring5Udemy.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
