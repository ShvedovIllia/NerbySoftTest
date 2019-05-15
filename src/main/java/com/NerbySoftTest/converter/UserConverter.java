package com.NerbySoftTest.converter;

import com.NerbySoftTest.entity.UserEntity;
import com.NerbySoftTest.entity.UserRequest;
import com.NerbySoftTest.entity.UserResponse;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public static UserEntity convert(UserRequest userRequest) {
        UserEntity entity = new UserEntity();
        entity.setEmail(userRequest.getEmail());
        entity.setUsername(userRequest.getUsername());
        entity.setPassword(userRequest.getPassword());
        return entity;
    }

    public static UserResponse convert(UserEntity userEntity) {
        UserResponse response = new UserResponse();
        response.setEmail(userEntity.getEmail());
        response.setUsername(userEntity.getUsername());
        return response;
    }
}
