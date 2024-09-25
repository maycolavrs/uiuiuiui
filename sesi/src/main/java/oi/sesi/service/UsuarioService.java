package oi.sesi.service;

import oi.sesi.model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    private List<Usuario> usuarios = new ArrayList<>();

    public void criarUsuario(String nome, String email, String senha) {
        Usuario usuario = new Usuario(nome, email, senha);
        usuarios.add(usuario);
    }

    public boolean logar(String email, String senha) {
        for (Usuario u : usuarios) {
            if (u.logar(email, senha)) {
                return true;
            }
        }
        return false;
    }

    public void executarLogin() {
     
        Usuario usuario = new Usuario("Nome do Usuário", "email@exemplo.com", "senha123");
        boolean loginSucesso = logar("email@exemplo.com", "senha123");

        if (loginSucesso) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Email ou senha incorretos.");
        }
    }
}
