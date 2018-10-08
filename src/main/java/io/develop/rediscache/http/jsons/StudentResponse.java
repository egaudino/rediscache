package io.develop.rediscache.http.jsons;

import io.develop.rediscache.domain.Student;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class StudentResponse implements Serializable {
    private String id;
    private String name;
    private String gender;
    private int grade;

}
