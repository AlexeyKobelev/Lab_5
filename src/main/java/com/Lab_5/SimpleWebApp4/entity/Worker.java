package com.Lab_5.SimpleWebApp4.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="worker", schema="user")

public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idworker",nullable = false)
    private Long id;

    @Column(name = "firstname",nullable = false)
    private String name;

    @Column(name ="lastname",nullable = false)
    private String surname;

    @ManyToOne
    @JoinColumn(name="id_dep")
    private Department department;

}
