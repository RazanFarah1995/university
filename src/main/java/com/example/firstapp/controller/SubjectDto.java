package com.example.firstapp.controller;

import com.example.firstapp.service.SubjectVO;
import lombok.Data;

@Data
public class SubjectDto {
    private final Long id;
    private final String name;
    private final int degree;

    public SubjectVO toVO(){
        return new SubjectVO(id, name, degree);
    }
}

