package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {
    @Test
    void validarAlgoSomenteNoUsuarioFranc(){
        Assumptions.assumeTrue("franc".equals(System.getenv("USERNAME")));
        Assertions.assertEquals(10, 5+5);
    }
}
