package com.student.lms.lms.entity;
import jakarta.persistence.*;
        import lombok.Data;

@Entity
@Data
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "batch_id")
    private Batch batch;
}

