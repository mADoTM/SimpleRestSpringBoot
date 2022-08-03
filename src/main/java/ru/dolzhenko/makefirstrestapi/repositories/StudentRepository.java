package ru.dolzhenko.makefirstrestapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import ru.dolzhenko.makefirstrestapi.Student;

@Component
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
