package com.ohgiraffers.section01.autowired.subsection01.field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        /* 설명.
        *   AnnotationConfigApplicationContext 생성자에 basePackages 문자열을 전달하여 ComponentScan
        *   개념을 따로 설정 클래스 없이 바로 적용할 수도 있다.
        * */
        ApplicationContext context
                = new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        BookService bookService = context.getBean("bookService",BookService.class);

        bookService.findAllBook().forEach(System.out::println);
    }
}
