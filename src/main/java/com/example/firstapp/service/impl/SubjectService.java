package com.example.firstapp.service.impl;

import com.example.firstapp.repository.Subject;
import com.example.firstapp.repository.SubjectRepository;
import com.example.firstapp.service.SubjectVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class SubjectService implements com.example.firstapp.service.SubjectService {
        private final SubjectRepository subjectRepository;

    @Override
    public Long insertSubject(SubjectVO subject) {
        Subject newSubject = subjectRepository.save(subject.toEntity());
        return newSubject.getId();
    }



}
