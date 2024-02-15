package com.ohgiraffers.section02.annotation.subsection03.collection;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("pokemonServiceCollection")
public class PokemonService {

    /* 설명. 같은 타입의 Bean이 2개 이상일 경우 List 혹은 Map 형태의 컬렉션 형태로 주입 받을 수 있다. */

    /* 필기. 1. 같은 타입의 Bean들을 List 형태로 주입 받을 수 있다. */
//    private List<Pokemon> pokemonList;
//
//    @Autowired
//    public PokemonService(List<Pokemon> pokemonList) {
//        this.pokemonList = pokemonList;
//    }
//
//    public void pokemonAttack() {
//        pokemonList.forEach(Pokemon :: attack);     // :: 참조를 한다.
//    }

    /* 필기. 2. 같은 타입의 Bean들을 Map 형태로도 주입 받을 수 있다.*/
    private Map<String, Pokemon> pokemonMap;

    @Autowired
    public PokemonService(Map<String, Pokemon> pokemonMap) {
        this.pokemonMap = pokemonMap;
    }

    /* 설명. key값은 Bean의 id가 넘어오고, value값은 Bean 객체의 주소 값이 넘어온다. */
    public void pokemonAttack(){
        pokemonMap.forEach((k,v) -> {
            System.out.println("key: " + k);
            System.out.println("value: " + v);
            v.attack();
        });
    }
}
