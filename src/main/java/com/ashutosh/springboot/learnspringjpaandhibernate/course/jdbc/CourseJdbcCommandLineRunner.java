package com.ashutosh.springboot.learnspringjpaandhibernate.course.jdbc;

import com.ashutosh.springboot.learnspringjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn Spring", "ashutosh"));
        repository.insert(new Course(2, "Learn AWS", "vinod"));
        repository.insert(new Course(3, "Learn cloud", "abhay"));
    }
}
