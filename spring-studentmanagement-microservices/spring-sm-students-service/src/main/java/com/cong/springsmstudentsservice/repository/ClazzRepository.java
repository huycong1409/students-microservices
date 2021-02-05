package com.cong.springsmstudentsservice.repository;

import com.cong.springsmstudentsservice.model.Clazz;
import com.cong.springsmstudentsservice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClazzRepository extends JpaRepository<Clazz, Integer> {
    Clazz findById(int id);
    List<Clazz> findAll();


}
