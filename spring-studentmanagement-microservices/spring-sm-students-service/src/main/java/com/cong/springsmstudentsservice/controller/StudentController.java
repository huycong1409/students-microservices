package com.cong.springsmstudentsservice.controller;

import com.cong.springsmstudentsservice.model.Student;
import com.cong.springsmstudentsservice.service.StudentSeviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentSeviceImpl studentSeviceImpl;

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudent(){

        List<Student> studentList = studentSeviceImpl.getAll();
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }

    @PostMapping("/add/{id}")
    public ResponseEntity<Void> createStudent(@RequestBody Student student, @PathVariable int id){
        studentSeviceImpl.save(student);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @GetMapping("/find/{id}")
    public Student findStudentById(@PathVariable int id){
        return studentSeviceImpl.findById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int id){
        Student student = studentSeviceImpl.findById(id);
        studentSeviceImpl.delete(student);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Student>> getAllStudentInClass(@PathVariable("id") int id){
        List<Student> studentList = studentSeviceImpl.getAllStudentByClassId(id);
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }

}
