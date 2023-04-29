package com.udemy.workshopmongo.controller;

import com.udemy.workshopmongo.domain.User;
import com.udemy.workshopmongo.dto.UserDTO;
import com.udemy.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        List<User> list = userService.findAll();
        List<UserDTO> listDTO = list.stream().map(UserDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }

    @GetMapping("{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable String id) {
        User user = userService.findById(id);
        UserDTO retreatUser = new UserDTO(user);
        return ResponseEntity.ok().body(retreatUser);
    }
}
