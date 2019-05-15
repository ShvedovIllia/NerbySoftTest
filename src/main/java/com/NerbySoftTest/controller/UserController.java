package com.NerbySoftTest.controller;

import com.NerbySoftTest.converter.UserConverter;
import com.NerbySoftTest.entity.UserEntity;
import com.NerbySoftTest.entity.UserRequest;
import com.NerbySoftTest.entity.UserResponse;
import com.NerbySoftTest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ResponseEntity<List<UserResponse>> findAll(Authentication authResult){
        return ResponseEntity.ok(userService.getAllUsers().stream().map(UserConverter::convert).collect(Collectors.toList()));
    }

    @RequestMapping(value = "/users/sign-up", method = RequestMethod.POST)
    public ResponseEntity<UserResponse> signUp(@RequestBody UserRequest user){
        UserEntity userEntity = userService.saveNewUser(UserConverter.convert(user));
        return ResponseEntity.ok(UserConverter.convert(userEntity));
    }

}
