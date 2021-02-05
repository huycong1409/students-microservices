package com.cong.springsmstudentsservice.service;

import com.cong.springsmstudentsservice.model.Clazz;
import com.cong.springsmstudentsservice.model.Student;
import com.cong.springsmstudentsservice.repository.ClazzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClazzServiceImpl implements ClazzService{

    @Autowired
    private ClazzRepository clazzRepository;



    @Override
    public List<Clazz> getAllClass() {
        return clazzRepository.findAll();
    }
}
