package com.ohgiraffers.section01.common;


import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
/* 필기. Type 은닉 (유지보수 + 확장성) */
public class BookDAOImpl implements BookDAO {

    private Map<Integer, BookDTO> bookList;

    public BookDAOImpl() {
        bookList = new HashMap<>();
        bookList.put(1, new BookDTO(1, 123456, "자바의 정석"
                , "남궁성", "도우출판", new Date()));
        bookList.put(2, new BookDTO(2, 2223333, "칭찬은 고래도 춤추게 한다."
                , "고래", "고래출판", new Date()));
    }

    @Override
    public List<BookDTO> findAllBook() {

        /* 설명. HashMap의 value들만 뽑아 ArrayList 형태로 반환 (Map -> List) */
        return new ArrayList<>(bookList.values());
    }
}
