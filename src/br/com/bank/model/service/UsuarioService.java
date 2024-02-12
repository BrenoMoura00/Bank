package br.com.bank.model.service;

import br.com.bank.model.entidades.Usuario;
import br.com.bank.model.repositorio.UsuarioRepositorio;

import java.util.Iterator;
import java.util.List;

public class UsuarioService {
    private UsuarioRepositorio usuarioRepositorio;

    public UsuarioService(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    public UsuarioService() {

    }

    public void salvar(Usuario usuario) {
        // Verifica se o usuário tem mais de 18 anos
        if (usuario.getIdade() < 18) {
            throw new IllegalArgumentException("Usuário só pode ser cadastrado se for maior de 18 anos");
        }

        // Verifica se o CPF é válido
        String cpf = usuario.getCpf();
        if (!ValidorCPF.validarCPF(cpf)) {
            throw new IllegalArgumentException("CPF não é válido");
        }

        // Se todas as verificações passarem, salva o usuário no repositório
        usuarioRepositorio.salvar(usuario);
    }

    public List<Usuario> listar() {
        return usuarioRepositorio.listar();
    }

    public void deletar(int id) {
        usuarioRepositorio.deletar(id);
    }

    public void alterar(Usuario usuario) {
        boolean usuarioEncontrado = false;

        for (Usuario u : usuarioRepositorio.listar()) {
            if (u.getId() == usuario.getId()) {
                usuarioEncontrado = true;
                break;
            }
        }
        if (!usuarioEncontrado) {
            throw new IllegalArgumentException("Usuário não encontrado para alteração");
        }
        usuarioRepositorio.alterar(usuario);
    }
}
