package com.ohgiraffers.section01.aop;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MemberDTO {
    private Long id;            // 회원이 21억을 넘을 것을 고려한 Long형 채택
    private String name;
}
