package com.ohgiraffers.section02.annotation.subsection4.resource;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("pokemonServiceResource")
public class PokemonService {

    /* 설명.
    *   @Qualifier와 마찬가지로 @Primary보다 우선순위 높게 우리가 원하는 Bean 이름(id)으로
    *   하나의 Bean을 주입받을 수 있다.
    * */
//    @Resource(name = "charmander")
//    private Pokemon pokemon;
//
//    public void pokemonAttack() {
//        pokemon.attack();
//    }

    @Resource
    private List<Pokemon> pokemonList;

    public void pokemonAttack(){
        pokemonList.forEach(Pokemon :: attack);
    }
}
