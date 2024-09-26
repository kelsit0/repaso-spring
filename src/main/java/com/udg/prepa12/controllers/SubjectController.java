package com.udg.prepa12.controllers;

import com.udg.prepa12.persistence.entities.SubjectEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/subject")
public class SubjectController {

    @GetMapping()
    public String root(){
        return "subject controller";
    }

    @PostMapping()
    public SubjectEntity createSubject(@RequestBody SubjectEntity sub){
        return sub;
    }

}
