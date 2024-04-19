package org.example.TP2;

public class StudentServiceMock implements StudentService {

    @Override
    public void createStudent(Student student) {
        // Simule l'ajout d'un étudiant
        System.out.println("Simulated creation of student: " + student.getName());
    }

    @Override
    public Student findStudentById(int id) {
        // Simule la recherche d'un étudiant par ID
        return new Student(id, "Simulated Student");
    }

    @Override
    public void displayStudent(int id) {
        // Simule l'affichage d'un étudiant
        Student student = findStudentById(id);
        System.out.println("Simulated display of student ID: " + student.getId() + ", Name: " + student.getName());
    }
}