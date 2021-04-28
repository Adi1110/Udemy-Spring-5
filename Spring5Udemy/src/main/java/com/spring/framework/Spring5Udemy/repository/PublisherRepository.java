package com.spring.framework.Spring5Udemy.repository;

import com.spring.framework.Spring5Udemy.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
