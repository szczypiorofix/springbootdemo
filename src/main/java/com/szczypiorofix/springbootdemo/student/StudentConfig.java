package com.szczypiorofix.springbootdemo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student student1 = new Student(
                    1L,
                    "John",
                    "john@gmail.com",
                    LocalDate.of(2000, 5, 15)
            );

            Student student2 = new Student(
                    2L,
                    "Jack",
                    "jack@gmail.com",
                    LocalDate.of(2003, 2, 24)
            );

            repository.saveAll(
                    List.of(student1, student2)
            );
        };
    }

}
