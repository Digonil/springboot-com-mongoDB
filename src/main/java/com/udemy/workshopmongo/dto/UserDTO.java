package com.udemy.workshopmongo.dto;

import com.udemy.workshopmongo.domain.User;

import java.io.Serializable;
import java.util.Optional;


public class UserDTO implements Serializable {
    private String userId;
    private String name;
    private String email;

    public UserDTO(Optional<User> user) {
    }

    public UserDTO(User user) {
        this.userId = user.getUserId();
        this.name = user.getName();
        this.email = user.getEmail();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
