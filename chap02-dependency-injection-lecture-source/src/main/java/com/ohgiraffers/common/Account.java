package com.ohgiraffers.common;

public interface Account {

    /* 설명. 잔액 조회 */
    String getBalance();

    /* 설명. 입금 */
    String desposit(int money);

    /* 설명. 출금 */
    String withDraw(int money);



}
