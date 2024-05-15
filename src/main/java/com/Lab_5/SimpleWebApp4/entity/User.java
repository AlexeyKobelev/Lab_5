package com.Lab_5.SimpleWebApp4.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "users", schema = "user")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column (name = "password",nullable = false)
    private String password;

    @Column(name ="email", nullable = false, unique = true)
    private String email;

    @Column(name ="role")
    private String role;
}
