package com.ohgiraffers.common;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class MemberDTO {
    private int sequence;               // 회원번호
    private String name;                // 이름
    private String phone;               // 휴대폰 번호
    private String email;               // 이메일
    private Account personalAccount;    // 개인 계좌
}
