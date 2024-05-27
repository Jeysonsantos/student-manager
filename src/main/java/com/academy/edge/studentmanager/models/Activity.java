package com.academy.edge.studentmanager.models;

import com.academy.edge.studentmanager.enums.ActivityType;
import jakarta.persistence.*;
import lombok.Data;
import java.sql.Date;

@Entity
@Data
@Table(name = "activities")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(updatable = false, nullable = false)
    String id;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;

    @Enumerated(EnumType.STRING)
    @Column
    private ActivityType activityType;

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

    @Column(nullable = false)
    private int hours;

    @Column(nullable = false)
    private Date startDate;

    @Column
    private Date conclusionDate;

    @Column(nullable = false)
    private boolean onGoing;

    @Column(nullable = false)
    private boolean paid;

}
