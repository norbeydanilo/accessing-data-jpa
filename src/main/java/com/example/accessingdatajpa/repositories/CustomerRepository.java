package com.example.accessingdatajpa.repositories;

import java.util.List;

import com.example.accessingdatajpa.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}
