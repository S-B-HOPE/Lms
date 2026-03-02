package com.student.lms.lms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.student.lms.lms.entity.Trainer;

public interface TrainerRepository extends JpaRepository<Trainer, Long> {
}