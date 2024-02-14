package com.ohgiraffers.section03.properties.subsection02.i18n;
// in-ternationalizatio-n 가운데에 18글자 이기에 i18n이라 부름

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

public class Application {

    /* 설명.
     *   i18n 소프트웨어의 국제화(Internationalization에서 첫 글자인 I와 마지막 글자인 n 사이에 알파벳 갯수가 18개)란?
     *    소프트웨어를 국제화 하기 위해서는 처리해야 할 작업이 많이 있다.
     *    1. 언어, 지역별 번역
     *    2. OS/Platform별 인코딩
     *    3. 문자열 치환 방법
     *    4. 국제화 UI(문자열 크기 변화, 폰트, 아이콘 등)
     *    5. 쓰기 방향의 차이
     *    6. 숫자, 공백, 화폐, 날짜, 주소, 측정 단위 등
     *    7. 타임존, 섬머타임 등 시각
     *    8. 문자열 정렬 방법
     *
     *  설명.
     *   우리가 다뤄본 예제는 이 중에서 1번에 해당하는 다국어 메시지 처리만 살펴 본 것이다.
     * */
    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String error404MessageKR = context.getMessage("error.404", null, Locale.KOREA);
        String error500MessageKR
                = context.getMessage("error.500", new Object[]{"여러분", new java.util.Date()}, Locale.KOREA);

        System.out.println("I18N error.404 메시지: " + error404MessageKR);
        System.out.println("I18N error.500 메시지: " + error500MessageKR);

        String error404MessageUS = context.getMessage("error.404", null, Locale.US);
        String error500MessageUS
                = context.getMessage("error.500", new Object[]{"you", new java.util.Date()}, Locale.US);

        System.out.println("I18N error.404 message: " + error404MessageUS);
        System.out.println("I18N error.500 message: " + error500MessageUS);
    }
}
