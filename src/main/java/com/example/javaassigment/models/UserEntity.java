package com.example.javaassigment.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserEntity {
  @Id
  public int id;
  public String name;
}
