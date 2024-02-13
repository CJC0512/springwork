package com.ohgiraffers.section03.annotationconfig.subsection01.java;

import com.ohgiraffers.common.MemberDAO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/* 필기. @Configuration: 설정용 class 표기 */
/* 설명. 설정용 클래스도 bean으로 관리되며 이름(bean의 id)을 부여할 수 있다. */
@Configuration("configurationSection03")            // 자신이 있는 package 만 실행. 따라서 밑에 적힌 개념들을 숙지해야 함.

/* 설명. 1. 단순히 범위 지정만으로 @Componenet 계열의 어노테이션들을 모두 bean으로 관리하는 경우 */
//@ComponentScan(basePackages = "com.ohgiraffers")        // com.ohgiraffers 안에 있는 Component들을 다 Scan해서 Bean으로 가져온다.

/* 설명. 2. 범위 및 필터를 적용해서 bean을 관리하는 경우 (excludeFilters) */
//@ComponentScan(basePackages = "com.ohgiraffers",
//        excludeFilters = {
//                @ComponentScan.Filter(
//                        /* 설명. 2-1. 타입으로 설정 */
//                        type = FilterType.ASSIGNABLE_TYPE,
//                        classes = {MemberDAO.class}
//
//                        /* 설명. 2-2. 어노테이션 종류로 설정 */
//                        type = FilterType.ANNOTATION,
//                        classes = {org.springframework.stereotype.Repository.class}
//                )
//        })

/* 설명. 3. 범위 및 필터를 적용해서 bean을 관리하는 경우 (includeFilters) */
@ComponentScan(basePackages = "com.ohgiraffers",        // {"com.ohgiraffers", "com"}
        useDefaultFilters = false,      // 전부 사용 안함 적용
        includeFilters = {
                @ComponentScan.Filter(
                        type = FilterType.ASSIGNABLE_TYPE,
                        classes = {MemberDTO.class}
                )
        }
)

/* 설명.
*   @ComponentScan은 필터의 경우 개념 정도만 알아도 되지만, 기본적으로 @Configuration 클래스가 위치한
*   패키지와 해당 패키지 하위만 Scan하기 때문에 더 상위 범위나 다른 패키지를 Scan하기 위해 주로 사용된다.
* */
public class ContextConfiguration {
}
