package br.com.bank.model.repositorio;

import br.com.bank.model.entidades.Usuario;

import java.util.Iterator;
import java.util.List;

public class UsuarioRepositorio implements IUsuarioRepositorio {
    private List<Usuario> usuarioList;

    public UsuarioRepositorio(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public void salvar(Usuario usuario) {
        usuarioList.add(usuario);
    }

    @Override
    public void alterar(Usuario usuario) {
        for (Usuario usuario1 : usuarioList) {
            if (usuario.getId() == usuario1.getId()) {
                usuarioList.remove(usuario1);
                usuarioList.add(usuario);
            }
        }
    }

    @Override
    public void deletar(int id) {
        Iterator<Usuario> iterator = usuarioList.iterator();
        while (iterator.hasNext()) {
            Usuario usuario = iterator.next();
            if (usuario.getId() == id) {
                iterator.remove();
                System.out.println("Usuário removido com sucesso.");
                return;
            }
        }
        System.out.println("Usuário com o ID " + id + " não encontrado.");
    }

    @Override
    public List<Usuario> listar() {
        return usuarioList;
    }

    @Override
    public Usuario listarPorId(int id) {
        return null;
    }
}
