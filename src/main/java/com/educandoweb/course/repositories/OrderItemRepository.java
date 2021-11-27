package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;

// @Repository  // Notação não necessária por conta do JpaRepository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
