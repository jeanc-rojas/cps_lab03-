package pe.edu.tecsup.lab03.services;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.repositories.StudentRepository;

import java.util.List;

public class StudentService {

    private StudentRepository repository;

    public StudentService() {
        this.repository = new StudentRepository();
    }

    public void registerStudent(int id, String name, String email) {
        StudentEntity student = new StudentEntity(id, name, email);
        repository.save(student);
    }

    public List<StudentEntity> getAllStudents() {
        return repository.findAll();
    }

}
