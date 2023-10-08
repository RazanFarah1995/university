package com.example.firstapp.service;

import com.example.firstapp.repository.Subject;
import lombok.Data;

@Data
public class SubjectVO {

    private final Long id;
    private final String name;
    private final int degree;

    public Subject toEntity() {
        return  new Subject (id, name, degree);
    }
}
