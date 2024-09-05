package com.udg.prepa12.persistence.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    private String name;
    private String password;
    private String email;

    private List<SubjectEntity> subjects;

}
