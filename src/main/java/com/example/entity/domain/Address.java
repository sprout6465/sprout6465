package com.example.entity.domain;

import jakarta.persistence.*;

@Entity
@Embeddable
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String post_address;
    private String detail_address;
}
