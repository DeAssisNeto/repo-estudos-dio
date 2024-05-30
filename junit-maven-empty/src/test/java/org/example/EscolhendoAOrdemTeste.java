package org.example;

import org.junit.jupiter.api.*;


//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoAOrdemTeste {
//    @Order(4)
    @DisplayName("Teste que validae se")
    @Test
    void validarFluxoA(){
        Assertions.assertTrue(true);
    }

//    @Order(3)
    @DisplayName("B")
    @Test
    void validarFluxoB(){
        Assertions.assertTrue(true);

    }

//    @Order(2)
    @DisplayName("C")
    @Test
    void validarFluxoC(){

    }

//    @Order(1)
    @DisplayName("D")
    @Test
    void validarFluxoD(){

    }
}
