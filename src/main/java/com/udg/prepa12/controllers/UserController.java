package com.udg.prepa12.controllers;
import com.udg.prepa12.persistence.entities.UserEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {
    
    @GetMapping()
    public String root(){
        return "Hello World";
    }
    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity user){
        return user;
    }

}
