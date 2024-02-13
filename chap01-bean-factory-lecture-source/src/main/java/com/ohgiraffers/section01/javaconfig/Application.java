package com.ohgiraffers.section01.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/* 필기. Spring IOC container는 콩 공장 */

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] beanNames = context.getBeanDefinitionNames();
        for(String beanName: beanNames){
            System.out.println("beanName: " + beanName);
        }


        /* 설명. 1. bean의 id(bean의 이름)를 이용해서 bean을 가져오는 방법 */
//        MemberDTO member = (MemberDTO) context.getBean("member");

        /* 설명. 2. bean의 를래스 메타 정보(bean의 타입)를 전달하여 가져오는 방법 */
//        MemberDTO member = context.getBean(MemberDTO.class);

        /* 설명. 3. bean의 id와 클래스 메타 정보를 이용해서 bean을 가져오는 방법 */
//        MemberDTO member = context.getBean("member", MemberDTO.class);

//        System.out.println("member = " + member);
    }
}
