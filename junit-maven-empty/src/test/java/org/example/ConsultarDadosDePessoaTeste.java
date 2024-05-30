package org.example;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosDePessoaTeste {
    @BeforeAll
    static void configurarConexao(){
        BancoDeDados.iniciarConexao();
        System.out.println("rodou configurarConexao");
    }

    @BeforeEach
    void inserirDadosParaTeste(){
        BancoDeDados.inserirDados(new Pessoa("Jose", LocalDate.of(2003, 03, 15)));
    }

    @AfterEach
    void removerDadosParaTeste(){
        BancoDeDados.removerDados(new Pessoa("Jose", LocalDate.of(2003, 03, 15)));
    }


    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }
    @Test
    void validarDadosDeRetorno2(){
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
        System.out.println("rodou finalizarConexao");
    }

}
