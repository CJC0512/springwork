package com.ohgiraffers.common;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    /* 설명. 카트에 물품 담는 기능 */
    public void addItem(Product item){
        items.add(item);
    }

    /* 설명. 카트의 물품 꺼내기 */
    public List<Product> getItems(){
        return items;
    }


}
