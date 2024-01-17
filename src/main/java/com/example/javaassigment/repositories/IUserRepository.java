package com.example.javaassigment.repositories;

import com.example.javaassigment.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserEntity, Long> {
}
