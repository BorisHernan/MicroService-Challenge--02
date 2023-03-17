package com.vallegrande.demo2.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "pagos")
@Data
public class Payment {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "type",length = 50, nullable = false)
    private String type;

    @Column(name = "currency",length = 50, nullable = false)
    private String currency;

    @Column(name = "number",length = 50, nullable = false)
    private String number;

    @Column(name = "account",length = 50, nullable = false)
    private String account;

    @Column(name = "expiration",length = 50, nullable = false)
    private String expiration;

    @Column(name = "cvv",length = 50, nullable = false)
    private String cvv;

    @Column(name = "description",length = 50, nullable = false)
    private String description;


}
