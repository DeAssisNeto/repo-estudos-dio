package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Pessoa {
    private String nome;

    private LocalDate nascimento;

    public Pessoa(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(this.nascimento, LocalDate.now());
    }

    public boolean maiordeIdade(){
        return 18 <= getIdade();
    }
}