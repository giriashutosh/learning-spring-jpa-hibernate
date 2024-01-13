package com.ashutosh.springboot.learnspringjpaandhibernate;

import com.ashutosh.springboot.learnspringjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.ashutosh.springboot.learnspringjpaandhibernate.course.jpa.CourseJPARepository;
import com.ashutosh.springboot.learnspringjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;
//    @Autowired
//    private CourseJPARepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Course(1, "Learn Spring Jpa", "ashutosh"));
//        repository.insert(new Course(2, "Learn AWS Jpa", "vinod"));
//        repository.insert(new Course(3, "Learn cloud Jpa", "abhay"));

          repository.save(new Course(1, "Learn Spring SpringDataJpa", "ashutosh"));
          repository.save(new Course(2, "Learn AWS SpringDataJpa", "vinod"));
          repository.save(new Course(3, "Learn cloud SpringDataJpa", "abhay"));
          repository.deleteById(1l);
          System.out.println(repository.findById(2l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("abhay"));
        System.out.println(repository.findByName("Learn AWS SpringDataJpa"));
    }
}
