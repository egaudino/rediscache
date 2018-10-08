package io.develop.rediscache.usecase;

import io.develop.rediscache.domain.Student;
import io.develop.rediscache.http.jsons.StudentRequest;
import io.develop.rediscache.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CreateStudent {

    private StudentRepository studentRepository;

    public void create(Student student) {
        studentRepository.save(student);
    }
}
