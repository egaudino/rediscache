package io.develop.rediscache.http;

import io.develop.rediscache.domain.ObtainStudent;
import io.develop.rediscache.domain.Student;
import io.develop.rediscache.http.jsons.StudentRequest;
import io.develop.rediscache.usecase.CreateStudent;
import io.netty.util.internal.UnstableApi;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/student")
public class StudentController {

    private CreateStudent createStudent;
    private ObtainStudent obtainStudent;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody StudentRequest studentRequest) {
        createStudent.create(studentRequest.toDomain(studentRequest));
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<Student>> find(@RequestParam String id) {
        return ResponseEntity.ok(obtainStudent.execute(id));
    }
}
