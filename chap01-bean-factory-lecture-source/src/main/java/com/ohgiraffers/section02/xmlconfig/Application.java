package com.ohgiraffers.section02.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        /* 필기. GenericXmlApplicationContext는 resources에서부터 경로가 시작되기에 resources까지의 경로를 따로 명시하지 않아도 된다. */
        ApplicationContext context
                = new GenericXmlApplicationContext("section02/xmlconfig/spring-context.xml");

        MemberDTO member = (MemberDTO) context.getBean("member");
        System.out.println("member = " + member);
    }

}
