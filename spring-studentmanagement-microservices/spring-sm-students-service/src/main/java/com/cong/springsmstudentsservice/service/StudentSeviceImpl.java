package com.cong.springsmstudentsservice.service;

import com.cong.springsmstudentsservice.model.Student;
import com.cong.springsmstudentsservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentSeviceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public List<Student> getAllStudentByClassId(int id) {
        List<Student> studentList = studentRepository.getAllStudentByClassId(id);
        return studentList;
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void delete(Student student) {
        studentRepository.delete(student);
    }
}
