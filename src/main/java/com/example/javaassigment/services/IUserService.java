package com.example.javaassigment.services;

import com.example.javaassigment.models.UserEntity;

import java.util.List;

public interface IUserService {
  List<UserEntity> GetAllUser();
  UserEntity GetDetailUser(long Id);
  UserEntity CreateUser(UserEntity user);
  UserEntity UpdateUser(UserEntity user, long id);
  void DeleteUser(long id);
}
