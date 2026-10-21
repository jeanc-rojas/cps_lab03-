package pe.edu.tecsup.lab03.controllers;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.services.StudentService;

import java.util.List;

public class StudentController {

    private StudentService service;

    public StudentController() {
        this.service = new StudentService();
    }

    public void mostrarBienvenida() {
        System.out.println("Sistema de gestion de estudiantes");
        System.out.println("Bienvenido al sistema.");
    }

    public void registrarEstudiante(int id, String name, String email) {
        service.registerStudent(id, name, email);
        System.out.println("Estudiante registrado correctamente.");
    }

    public void listarEstudiantes() {
        List<StudentEntity> students = service.getAllStudents();

        for (StudentEntity student : students) {
            System.out.println(
                    "ID: " + student.getId()
                            + " | Nombre: " + student.getName()
                            + " | Correo: " + student.getEmail()
            );
        }
    }

}
