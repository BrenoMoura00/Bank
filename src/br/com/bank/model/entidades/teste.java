package br.com.bank.model.entidades;

import br.com.bank.model.repositorio.UsuarioRepositorio;
import br.com.bank.model.service.UsuarioService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class teste {
    public static void main(String[] args) {
        Login login = new Login("teste@gmail.com", "teste123", "81238183");
        Endereco endereco = new Endereco("teste", 12, "testeee", "testee", "123");
        Usuario usuario = new Usuario(1, "Breno", "123.543.314-52", 18, LocalDate.of(2006, 1, 4), "234", endereco, login);
        var repositorio = new UsuarioRepositorio();
        var rep = new UsuarioService(repositorio);
        rep.salvar(usuario);

        List<Usuario> usuarioList = rep.listar();
        System.out.println("===============Adicionou=================");
        System.out.println(usuarioList);

        Login loginNovo = new Login("teste@gmail.com", "teste123", "81238183");
        Endereco enderecoNovo = new Endereco("teste", 12, "testeee", "testee", "123");
        Usuario usuarioNovo = new Usuario(1, "Sérgio", "866,558,254-15", 48, LocalDate.of(1973, 8, 9), "234", endereco, login);

        rep.alterar(usuarioNovo);

        List<Usuario> usuarioLi = rep.listar();
        System.out.println("===============Alterou===================");
        System.out.println(usuarioList);

        rep.deletar(1);


        System.out.println("===============Deletou====================");
        System.out.println(usuarioList);

    }
}
