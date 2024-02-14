package com.ohgiraffers.common;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
    private String name;        // 상품명
    private int price;          // 상품 가격
}
