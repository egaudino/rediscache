package io.develop.rediscache.http.jsons;

import io.develop.rediscache.domain.Student;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class StudentRequest {
    private String id;
    private String name;
    private String gender;
    private int grade;

    public Student toDomain(StudentRequest request) {
        Student student = new Student();
        student.setId(request.getId());
        student.setName(request.getName());
        student.setGender(request.getGender());
        student.setGrade(request.getGrade());
        return student;
    }
}
