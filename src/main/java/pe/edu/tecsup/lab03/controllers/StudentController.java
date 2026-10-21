package com.example.student;

import java.util.List;

public class StudentController {

    private StudentService service;

    public StudentController() {
        this.service = new StudentService();
    }

    public void mostrarBienvenida() {
        System.out.println("================================");
        System.out.println("  SISTEMA DE ESTUDIANTES");
        System.out.println("================================");
    }

    public void registrarEstudiante(int id, String name, String email) {
        service.registerStudent(id, name, email);
        System.out.println("Estudiante registrado correctamente.");
    }

    public void listarEstudiantes() {
        List<StudentEntity> students = service.getAllStudents();

        if (students.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        System.out.println("\n--- LISTA DE ESTUDIANTES ---");

        for (StudentEntity student : students) {
            System.out.println(
                    "ID: " + student.getId()
                            + " | Nombre: " + student.getName()
                            + " | Correo: " + student.getEmail()
            );
        }
    }

    public void buscarEstudiante(int id) {
        List<StudentEntity> students = service.getAllStudents();

        for (StudentEntity student : students) {
            if (student.getId() == id) {
                System.out.println("\n--- ESTUDIANTE ENCONTRADO ---");
                System.out.println("ID: " + student.getId());
                System.out.println("Nombre: " + student.getName());
                System.out.println("Correo: " + student.getEmail());
                return;
            }
        }

        System.out.println("No se encontro un estudiante con ID " + id);
    }

}