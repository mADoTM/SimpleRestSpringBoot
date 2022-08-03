package ru.dolzhenko.makefirstrestapi.services;

import org.springframework.stereotype.Component;
import ru.dolzhenko.makefirstrestapi.Student;
import ru.dolzhenko.makefirstrestapi.repositories.StudentRepository;

import java.util.List;
import java.util.Optional;

@Component
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> list() {
        return studentRepository.findAll();
    }

    public Student findById(int id) {
        Optional<Student> item = studentRepository.findById(id);
        if(item.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return item.get();
    }

    public Student add(Student student) {
        return studentRepository.save(student);
    }

    public void delete(int id) {
        Student student = findById(id);
        studentRepository.delete(student);
    }

    public void update(Student newStudent, int id) {
        Student oldStudent = findById(id);
        oldStudent.setName(newStudent.getName());
        add(oldStudent);
    }
}
