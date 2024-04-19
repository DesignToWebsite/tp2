package org.example.TP2;

import java.util.List;

public interface StudentRepository {
    void save(Student student);
    Student findById(int id);
    List<Student> findAll();
}