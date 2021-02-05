package com.cong.springsmstudentsservice.service;

import com.cong.springsmstudentsservice.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();
    Student findById(int id);
    void save(Student student);
    void delete(Student student);

    List<Student> getAllStudentByClassId(int id);
}
