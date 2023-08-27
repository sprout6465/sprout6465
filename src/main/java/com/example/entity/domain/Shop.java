package com.example.entity.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shop_name;//소품샾 이름
    private byte[] shop_picture;//소품샾 사진
    private String shop_introduction;//소품샾 설명
    private String user_to_shop;//현재 위치에서 소품샾 까지의 거리
    @Embedded
    private List<Review> review = new ArrayList<>();
    private int review_count;//리뷰 개수
}
