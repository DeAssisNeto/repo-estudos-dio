package me.dio.mockito.exemplos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {
    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro(){
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG", "Patos de Minas", "Rua 2", "AP", "Centro");
        Mockito.when(apiDosCorreios.buscarDadosComBaseNoCep("4634551")).thenReturn(dadosLocalizacao);

        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Willyan", "4354253623", LocalDate.now(), "4634551");

        Assertions.assertEquals("Willyan", pessoa.getNome());
        Assertions.assertEquals("4354253623", pessoa.getDocumento());
        Assertions.assertEquals("MG", pessoa.getEndereco().getUf());
    }


}
