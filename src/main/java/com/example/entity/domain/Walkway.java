package com.example.entity.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Walkway {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String walkway_name;//산책로 이름
    private byte[] walkway_picture;//산책로 사진
    private String walkway_introduction;//산책로 설명
    private String walkway_distance;//산책로 길이
    private String walkway_time;//산책 시간
    private String user_to_walkway;//현재 위치에서 산책로 까지의 거리
    @Embedded
    private List<Review> review= new ArrayList<>(); // 산책로에 적힌 리뷰
    private int review_count;//리뷰 개수
    //지도위에 표시 기능
}
