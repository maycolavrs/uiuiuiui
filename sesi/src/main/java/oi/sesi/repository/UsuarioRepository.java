package oi.sesi.repository;

import oi.sesi.model.Usuario;
import java.util.List;

public interface UsuarioRepository {
    void criar(Usuario usuario);
    List<Usuario> listar();
    Usuario encontrarPorId(int id);
    void atualizar(Usuario usuario);
    void remover(int id);
}
