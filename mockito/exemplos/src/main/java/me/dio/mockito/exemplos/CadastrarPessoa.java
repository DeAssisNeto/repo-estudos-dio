package me.dio.mockito.exemplos;

import java.time.LocalDate;

public class CadastrarPessoa {
    private ApiDosCorreios apiDosCorreios;

    public CadastrarPessoa(final ApiDosCorreios apiDosCorreios) {
        this.apiDosCorreios = apiDosCorreios;
    }

    public Pessoa cadastrarPessoa(final String nome, final String documento, final LocalDate nascimento, String cep) {
        Pessoa pessoa = new Pessoa(nome, documento, nascimento);
        DadosLocalizacao dadosLocalizacao = apiDosCorreios.buscarDadosComBaseNoCep(cep);
        pessoa.adicionarDadosDeEndereco(dadosLocalizacao);
        return pessoa;
    }
}
