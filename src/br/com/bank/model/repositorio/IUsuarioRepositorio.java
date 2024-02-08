package br.com.bank.model.repositorio;

import br.com.bank.model.entidades.Usuario;

import java.util.List;

public interface IUsuarioRepositorio {
    void salvar(Usuario usuario);
    void alterar(Usuario usuario);
    void deletar(int id);
    List<Usuario> listar();
    Usuario listarPorId(int id);
}
