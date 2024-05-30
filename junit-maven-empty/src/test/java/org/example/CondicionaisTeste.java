package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {
    @Test
    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "franc")
    void validarAlgoSomenteNoUsuarioFranc(){
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "USERNAME", matches = "franc")
    void validarAlgoSomenteSeNaoNoUsuarioFranc(){
        System.out.println("sei n");
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void validarAlgoSomenteSeLinux(){
        System.out.println("sei n");
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @DisabledOnJre(JRE.JAVA_17)
    void validarAlgoSomenteSeJava17(){
        System.out.println("sei n");
        Assertions.assertEquals(10, 5+5);
    }
}
