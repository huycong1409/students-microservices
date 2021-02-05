package com.cong.springsmstudentsservice.controller;

import com.cong.springsmstudentsservice.model.Clazz;
import com.cong.springsmstudentsservice.model.Student;
import com.cong.springsmstudentsservice.service.ClazzServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/class")
public class ClazzController {

    @Autowired
    private ClazzServiceImpl clazzServiceImpl;

    @GetMapping("/getAllClass")
    public ResponseEntity<List<Student>> getAllClass(){
        List<Clazz> clazzList = clazzServiceImpl.getAllClass();
        return new ResponseEntity(clazzList, HttpStatus.OK);
    }
}
