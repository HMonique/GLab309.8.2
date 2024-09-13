package com.lewis.Studentlogin.Repository;

import com.lewis.Studentlogin.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>
{

    Student findByEmail(String email);
}


