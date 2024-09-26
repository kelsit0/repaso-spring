package com.udg.prepa12.controllers;

import com.udg.prepa12.persistence.entities.TeacherEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/teacher")
public class TeacherController {


    @GetMapping
    public String root(){
        return "teacher router";
    }

    @PostMapping
    public TeacherEntity createTeacher(@RequestBody TeacherEntity teacher){
        return teacher;
    }
}
