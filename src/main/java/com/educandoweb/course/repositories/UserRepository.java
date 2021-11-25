package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

// @Repository  // Notação não necessária por conta do JpaRepository
public interface UserRepository extends JpaRepository<User, Long> {

}
