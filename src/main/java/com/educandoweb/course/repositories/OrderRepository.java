package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;

// @Repository  // Notação não necessária por conta do JpaRepository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
