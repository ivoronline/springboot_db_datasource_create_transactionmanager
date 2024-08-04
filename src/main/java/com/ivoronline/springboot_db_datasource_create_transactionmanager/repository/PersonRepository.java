package com.ivoronline.springboot_db_datasource_create_transactionmanager.repository;

import com.ivoronline.springboot_db_datasource_create_transactionmanager.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> { }
