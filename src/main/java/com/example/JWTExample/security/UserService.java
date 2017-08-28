package com.example.JWTExample.security;

import java.util.Optional;

import com.example.JWTExample.entity.User;

/**
 *
 * @author vladimir.stankovic
 *
 * Aug 17, 2016
 */
public interface UserService {
    public Optional<User> getByUsername(String username);
}
