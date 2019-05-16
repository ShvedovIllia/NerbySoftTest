package com.NerbySoftTest.service.impl;

import com.NerbySoftTest.entity.UserEntity;
import com.NerbySoftTest.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCrypt;

    @Override
    public UserDetails loadUserByUsername(String email) {
        //    UserEntity userEntity = userRepository.findByEmail(username);

        UserEntity user = userRepository.findByEmail(email);
//        UserEntity user = new UserEntity();
//
//        user.setEmail("shvedov.illia@gmail.com");
//        user.setPassword(bCrypt.encode("1234"));

        return user;
    }
}