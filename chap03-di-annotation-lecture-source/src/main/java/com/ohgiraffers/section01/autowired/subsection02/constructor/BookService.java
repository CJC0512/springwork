package com.ohgiraffers.section01.autowired.subsection02.constructor;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(/*value = */"bookServiceConstructor")
public class BookService {
    private final BookDAO bookDAO;

    /* 설명.
     *   BookDAO 타입의 빈 객체를 생성자를 통해 주입 받는다.
     *   (@Autowired를 생성자에 작성하고 주입받을 타입의 bean을 매개변수로 작성한다.) (기본생성자 X)
     *
     *  설명.
     *   생성자 주입의 이점
     *   1. 필드에 final 키워드를 사용할 수 있다.
     *   2. 순환 참조를 스프링 시작(컨테이너 생성 시)과 동시에 확인하고 에러를 발생시켜 준다.
     *   3. 중간에 값이 오염되지 않음을 확신을 가지고 쓸 수 있다. (불변성)
     *   4. 테스트 코드 작성 시, 테스트 코드에 @Autowired 또는 주입받는 대상의 setter 등을 추가하지 않고 순수 자바 코드로 테스트 가능하다.
     * */
    @Autowired
    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public List<BookDTO> findAllBook() {
        return bookDAO.findAllBook();
    }

    public BookDTO searchBookBySequence(int sequence) {
        return bookDAO.searchBookBySequence(sequence);
    }
}
