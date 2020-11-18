package com.homework.wk05.starters;

import io.kimmking.spring01.Student;
import io.kimmking.spring02.Klass;
import io.kimmking.spring02.School;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AutoConfiguration {

    @Bean(name = "student100", initMethod = "init")
    public Student student() {
        return new Student();
    }

    @Bean
    public Klass klass() {
        Klass klass = new Klass();
        klass.setStudents(this.students());
        return klass;
    }

    @Bean
    public List<Student> students() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "student01"));
        students.add(new Student(2, "student02"));
        return students;
    }

    @Bean
    public School school() {
        return new School();
    }
}
