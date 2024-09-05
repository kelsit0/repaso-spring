package com.udg.prepa12.persistence.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeacherEntity {
    private String name;
    private String password;
    private String email;

    private List<SubjectEntity> subjects;

}
