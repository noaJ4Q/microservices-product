package com.example.serviceproduct.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "categories")
@JsonIgnoreProperties({"picture"})
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoryID", nullable = false)
    private Integer id;

    @Column(name = "categoryname", nullable = false, length = 15)
    private String categoryName;

    @Lob
    @Column(name = "description")
    private String description;

    @Column(name = "picture")
    private byte[] picture;

}