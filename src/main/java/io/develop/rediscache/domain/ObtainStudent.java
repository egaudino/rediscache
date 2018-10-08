package io.develop.rediscache.domain;

import io.develop.rediscache.http.jsons.StudentResponse;
import io.develop.rediscache.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class ObtainStudent {

    private StudentRepository studentRepository;

    public Optional<Student> execute(String id) {
        return studentRepository.findById(id);
    }
}
