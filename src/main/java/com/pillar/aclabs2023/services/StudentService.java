package com.pillar.aclabs2023.services;

import com.pillar.aclabs2023.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pillar.aclabs2023.repositories.StudentRepository;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void updateStudent(Student updatedStudent) {
        studentRepository.save(updatedStudent);
    }

    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }
}
