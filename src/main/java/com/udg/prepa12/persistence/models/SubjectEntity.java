package com.udg.prepa12.persistence.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectEntity {

    private String name;
    private String description;
    private List<UserEntity> students= new ArrayList<>();
    private TeacherEntity teacher;

}
