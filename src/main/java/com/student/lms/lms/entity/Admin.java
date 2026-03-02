package com.student.lms.lms.entity;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Admin {

     @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;
        private String email;
        private String password;

        private boolean verified = false;

        private String role = "ADMIN";
    }
