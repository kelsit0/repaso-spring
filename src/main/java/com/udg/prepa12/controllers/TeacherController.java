package com.udg.prepa12.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/teacher")
public class TeacherController {


    @GetMapping
    public String root(){
        return "teacher router";
    }

}
