package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Product;

// @Repository  // Notação não necessária por conta do JpaRepository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
