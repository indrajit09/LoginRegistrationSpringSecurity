package com.indra.springboot.springsecurity.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.indra.springboot.springsecurity.model.User;
import com.indra.springboot.springsecurity.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

	User findByEmail(String email);

	User save(UserRegistrationDto registration);
}
