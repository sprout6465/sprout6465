package com.example.entity.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Embeddable
@Entity
public class Waiting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean waiting_start; // 웨이팅 시작
    @Embedded
    private List<User> user = new ArrayList<>(); //웨이팅 유저 정보
    // ->웨이팅 번호랑 유저 id랑 그냥 묶는 걸로 대체 하고 싶습니다.
    private int current_waiting_number; //현재 웨이팅 입장 순서
    private int last_waiting_number;//웨이팅 마지막 번호
    //알림 기능?? -- 순번 2팀전
    //다음으로 손님으로 넘기는 기능
}