package com.example.entity.domain;

import jakarta.persistence.*;

@Embeddable
@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name; //식당 이름
    @Embedded
    private Address address;//식당 주소
    private String restaurant_phone_number; //식당 전화 번호
    private byte[] picture; //식당 사진
    private String type; // 업종
    private String introduction; //식당 소개글
    private Boolean parking; //주차 가능 여부
    private String open_time; // 오픈 시간
    private String close_time; // 마감 시간
    private Waiting waiting; // 식당 웨이팅 정보



}
