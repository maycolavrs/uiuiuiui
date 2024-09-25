package oi.sesi.controller;

import oi.sesi.service.UsuarioService;

public class UsuarioController {
    private UsuarioService usuarioService = new UsuarioService();

    public void cadastrarUsuario(String nome, String email, String senha) {
        usuarioService.criarUsuario(nome, email, senha);
    }

    public void logarUsuario(String email, String senha) {
        boolean loginSucesso = usuarioService.logar(email, senha);

        if (loginSucesso) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Email ou senha incorretos.");
        }
    }
}
