package com.ohgiraffers.section01.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    /* 설명.
    *   타겟 클래스의 메소드에서 어드바이스를 적용할 수 있는 지점들을 조인 포인트(joinpoint)라고 한다.
    *   포인트컷(pointcut)은 여러 조인포인트들에 어드바이스(advice)를 적용할 곳을 지정한 것이다.
    *   해당 조인포인트에서 어드바이스가 동작한다.
    *
    *  설명.
    *   <포인트컷 표현식>
    *   execution([수식어] 리턴타입 [클래스이름]. 이름(파라미터))
    *   1. 수식어: public, private 등 수식어를 명시 (생략 가능)
    *   2. 리턴 타입: 리턴 타입을 ㅁ여시
    *   3. 클래스 이름(패키지명 포함) 및 메소드 이름: 클래스 이름과 메소드 이름을 명시
    *   4. 파라미터(매개변수):: 메소드의 파라미터를 명시
    *   5. " * ": 1개이면서 모든 값이 올 수 있음
    *   6. " .. ": 0개 이상의 모든 값이 올 수 있음
    *
    *  설명.
    *   ex1)
    *    execution(public Integer com.ohgiraffers.section01.advice.*.*(*))
    *    => com.ohgiraffers.section01.advice 패키지에 속해 있는 바로 다음 하위 클래스에 파라미터가 1개인 모든 메소드이자
    *       접근 제어자가 public이고 반환형이 Integer인 경우
    *   ex2)
    *    execution(* com.ohgiraffers.section01.advice.annotation..stu*(..))
    *    => com.ohgiraffers.section01.advice 패키지 미치 하위 패키지에 속해있고 이름이 stu로 시작하는 파라미터가
    *       0개 이상인 모든 메소드이며 접근 제어자와 반환형은 상관 없음*/
    @Pointcut("execution(* com.ohgiraffers.section01.aop.*Service.*(..))")
    public void logPointcut(){}

//    @Before("execution(* com.ohgiraffers.section01.aop.*Service.*(..))")
    @Before("LoggingAspect.logPointcut()")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("Before Advice 동작");
    }
}
