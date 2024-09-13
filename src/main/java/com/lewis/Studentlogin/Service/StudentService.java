package com.lewis.Studentlogin.Service;

import com.lewis.Studentlogin.model.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(StudentDTO studentDto);
    Student findStudentByEmail(String email);
    List<StudentDTO> findAllStudents();
}

