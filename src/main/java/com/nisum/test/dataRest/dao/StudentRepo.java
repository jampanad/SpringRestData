package com.nisum.test.dataRest.dao;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@SpringBootApplication
@EnableAutoConfiguration
@RepositoryRestResource(path = "student")
public interface StudentRepo extends PagingAndSortingRepository<Student, Integer> {

}
