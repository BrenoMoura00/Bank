package br.com.bank.model.entidades;

import br.com.bank.model.repositorio.UsuarioRepositorio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class teste {
    public static void main(String[] args) {
        Login login = new Login("teste@gmail.com", "teste123","81238183");
        Endereco endereco = new Endereco("teste", 12, "testeee", "testee", "123");
        Usuario usuario = new Usuario(1, "Breno", "123.123.123-12", 18, LocalDate.now(),"234",endereco, login);

        UsuarioRepositorio rep = new UsuarioRepositorio(new ArrayList<>());
        rep.salvar(usuario);

        List<Usuario> usuarioList = rep.listar();
        System.out.println(usuarioList);

        Login loginNovo = new Login("teste@gmail.com", "teste123","81238183");
        Endereco enderecoNovo = new Endereco("teste", 12, "testeee", "testee", "123");
        Usuario usuarioNovo = new Usuario(1, "Teste", "123.123.123-12", 18, LocalDate.now(),"234",endereco, login);

        rep.alterar(usuarioNovo);

        List<Usuario> usuarioListNovo = rep.listar();
        System.out.println(usuarioList);

        rep.deletar(1);
        System.out.println(usuarioList);

    }
}
