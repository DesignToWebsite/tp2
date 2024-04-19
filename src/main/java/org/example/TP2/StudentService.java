package org.example.TP2;

public interface StudentService {
    void createStudent(Student student);
    Student findStudentById(int id);
    void displayStudent(int id);
}