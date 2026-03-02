package com.student.lms.lms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.student.lms.lms.entity.Batch;

public interface BatchRepository extends JpaRepository<Batch, Long> {
}