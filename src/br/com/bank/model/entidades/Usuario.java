package br.com.bank.model.entidades;

import java.time.LocalDate;

public class Usuario {
    private int id;
    private String nome;
    private String cpf;
    private int idade;
    private LocalDate dataNascimento;
    private String rgUsuario;
    private Endereco endereco;
    private Login login;

    public Usuario(int id, String nome, String cpf, int idade, LocalDate dataNascimento, String rgUsuario, Endereco endereco, Login login) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.rgUsuario = rgUsuario;
        this.endereco = new Endereco(endereco);
        this.login = new Login(login);
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

    public Endereco getEndereco() {
        return endereco;
    }

    public Login getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                ", dataNascimento=" + dataNascimento +
                ", rgUsuario='" + rgUsuario + '\'' +
                ", endereco=" + endereco +
                ", login=" + login +
                '}';
    }
}
