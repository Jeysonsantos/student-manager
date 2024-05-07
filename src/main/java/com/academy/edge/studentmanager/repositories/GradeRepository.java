package com.academy.edge.studentmanager.repositories;

import com.academy.edge.studentmanager.models.Grade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeRepository extends CrudRepository<Grade, String>{
    List<Grade> findGradeByStudentId(String studentId);
}
