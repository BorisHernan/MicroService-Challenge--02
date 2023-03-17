package com.vallegrande.demo2.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "certificado")
@Data
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "institute",length = 50, nullable = false)
    private String institute;

    @Column(name = "date",length = 50, nullable = false)
    private String date;

    @Column(name = "price",length = 50, nullable = false)
    private String price;

}
