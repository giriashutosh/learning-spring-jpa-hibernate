package com.ashutosh.springboot.learnspringjpaandhibernate.course.jpa;

import com.ashutosh.springboot.learnspringjpaandhibernate.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJPARepository {
    @PersistenceContext
    private EntityManager entityManger;

    public void insert(Course course){
           entityManger.merge(course);
    }

    public Course findById(long id){
        return entityManger.find(Course.class, id);
    }
    public void deleteById(long id){
        Course course = entityManger.find(Course.class, id);
        entityManger.remove(course);
    }

}
