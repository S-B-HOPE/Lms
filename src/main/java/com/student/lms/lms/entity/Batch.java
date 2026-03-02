package com.student.lms.lms.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Batch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String batchName;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}

