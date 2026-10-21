package pe.edu.tecsup.lab03.repositories;

import pe.edu.tecsup.lab03.entities.StudentEntity;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private List<StudentEntity> students = new ArrayList<>();

    public void save(StudentEntity student) {
        students.add(student);
    }

    public List<StudentEntity> findAll() {
        return students;
    }

}
