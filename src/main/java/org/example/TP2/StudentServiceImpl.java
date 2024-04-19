package org.example.TP2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void createStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student findStudentById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public void displayStudent(int id) {
        Student student = findStudentById(id);
        if (student != null) {
            System.out.println("Student ID: " + student.getId());
            System.out.println("Student Name: " + student.getName());
        } else {
            System.out.println("Student not found.");
        }
    }
}