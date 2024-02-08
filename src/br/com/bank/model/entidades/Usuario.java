package br.com.bank.model.entidades;

import java.time.LocalDate;

public class Usuario {
    private int id;
    private String nome;
    private String cpf;
    private int idade;
    private LocalDate dataNascimento;
    private String rgUsuario;

    public Usuario(int id, String nome, String cpf, int idade, LocalDate dataNascimento, String rgUsuario) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.rgUsuario = rgUsuario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getRgUsuario() {
        return rgUsuario;
    }
}
