package com.halilsahin.librarybackendservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "library")
public class Library {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "isbn")
    private String ISBN;
    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String author;
    @Column(name = "edition")
    private String edition;
    @Column(name = "publication")
    private String publication;
}
