package ru.dolzhenko.makefirstrestapi.controllers;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import ru.dolzhenko.makefirstrestapi.Student;
import ru.dolzhenko.makefirstrestapi.services.StudentService;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> index() {
        return studentService.list();
    }

    @GetMapping("/{id}")
    public Student studentById(@PathVariable int id) {
        return  studentService.findById(id);
    }

    @PostMapping
    public Student add(@RequestBody Student student) {
        return studentService.add(student);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Student student, @PathVariable int id) {
        studentService.update(student, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        studentService.delete(id);
    }
}
