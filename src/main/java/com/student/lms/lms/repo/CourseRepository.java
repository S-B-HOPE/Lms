package com.student.lms.lms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.student.lms.lms.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}