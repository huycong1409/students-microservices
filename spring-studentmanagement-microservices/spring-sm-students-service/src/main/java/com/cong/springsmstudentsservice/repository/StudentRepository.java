package com.cong.springsmstudentsservice.repository;

import com.cong.springsmstudentsservice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Integer > {
    Student findById(int id);

    @Query(value = "SELECT * FROM Student s WHERE s.class_id = ?1", nativeQuery = true)
    List<Student> getAllStudentByClassId(int id);

}
