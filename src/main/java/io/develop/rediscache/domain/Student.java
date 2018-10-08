package io.develop.rediscache.domain;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash
@Data
public class Student implements Serializable {
    private String id;
    private String name;
    private String gender;
    private int grade;
}
