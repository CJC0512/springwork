package com.ohgiraffers.section02.annotation.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pikachu implements Pokemon{
    @Override
    public void attack() {
        System.out.println("피카츄 백만볼트");
    }
}
