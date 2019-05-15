package com.NerbySoftTest.service;

import com.NerbySoftTest.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<UserEntity> getAllUsers();

    UserEntity saveNewUser(UserEntity userEntity);
}
