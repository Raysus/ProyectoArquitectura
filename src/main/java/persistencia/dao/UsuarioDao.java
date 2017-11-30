/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.dao;

import modelo.Usuario;

/**
 *
 * @author dci
 */
public interface UsuarioDao {
    public Usuario loginUsuario(String codAlfanumerico);
    public String registrarUsuario(Usuario usu);
}
