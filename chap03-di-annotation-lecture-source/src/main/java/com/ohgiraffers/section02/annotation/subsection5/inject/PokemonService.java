package com.ohgiraffers.section02.annotation.subsection5.inject;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.stereotype.Service;

@Service("pokemonServiceInject")
public class PokemonService {

    /* 설명. 1. Inject 라이브러리 활용한 필드 추출 */
//    @Inject
//    @Named("squirte")
    private Pokemon pokemon;

    /* 설명. 2. 생성자 주입 */
//    @Inject
//    public PokemonService(@Named("charmander") Pokemon pokemon) {
//        this.pokemon = pokemon;
//    }

    /* 설명. 3. setter 주입 */
    @Inject
    public void setPokemon(@Named("squirtle") Pokemon pokemon){
        this.pokemon=pokemon;
    }
    public void pokemonAttack() {
    }
}
