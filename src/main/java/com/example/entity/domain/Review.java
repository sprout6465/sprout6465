package com.example.entity.domain;

import jakarta.persistence.*;

@Embeddable
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private User user;//작성자
    private String title;//리뷰 제목
    private String detail;//리뷰 내용
}