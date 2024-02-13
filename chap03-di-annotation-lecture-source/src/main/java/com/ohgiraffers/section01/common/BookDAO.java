package com.ohgiraffers.section01.common;

import java.util.List;

public interface BookDAO {

    List<BookDTO> findAllBook();

    BookDTO searchBookBySequence(int sequence);
}
