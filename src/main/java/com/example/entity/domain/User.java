package com.example.entity.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Embeddable
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name; //이름
    private String email; //이메일
    private String password; //비밀 번호
    private String phone_number; //전화 번호
    @Embedded
    private List<Restaurant> restaurant = new ArrayList<>();//본인 웨이팅 식당 //본인 웨이팅 순번
    @Embedded
    private List<Review> review = new ArrayList<>();//본인이 써놓은 산책로, 소품샾 리뷰
}
