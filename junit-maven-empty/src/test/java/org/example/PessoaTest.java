package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {
    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa jose = new Pessoa("José", LocalDate.of(2003, 03, 15));
        Assertions.assertEquals(21, jose.getIdade());
    }

    @Test
    void deveRetornarSeEmaiorDeIdade(){
        Pessoa jose = new Pessoa("José", LocalDate.of(2003, 03, 15));
        Assertions.assertTrue(jose.maiordeIdade());

        Pessoa joao = new Pessoa("João", LocalDate.now());
        Assertions.assertFalse(joao.maiordeIdade());
    }
}
