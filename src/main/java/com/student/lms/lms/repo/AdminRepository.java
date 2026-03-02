package com.student.lms.lms.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.student.lms.lms.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Optional<Admin> findByEmail(String email);
}