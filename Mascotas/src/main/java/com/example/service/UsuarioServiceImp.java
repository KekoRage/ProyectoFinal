/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;
import com.example.model.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.service.UsuarioService;
import com.example.dao.UsuarioRepository;

@Service
public class UsuarioServiceImp implements UsuarioService
{
@Autowired
private UsuarioRepository repositorio;
	@Override
	public List<Usuario> listadoUsuarios() {
		return repositorio.findAll();
	}

	@Override
	public Usuario UsuarioUnico(int id) {
		return repositorio.findById(id);
		
	}
        @Override
	public Usuario comprobarLogin(String usuario, String pass) {
		return repositorio.findByUsuarioAndPassword(usuario,pass);
		
	}
        
        
	@Override
	public Usuario altaUsuario(Usuario p) {
		
		return repositorio.save(p);
	}

	@Override
	public Usuario editarUsuario(Usuario p) {
		return repositorio.save(p);
		
	}

	@Override
	public Usuario eliminarUsuario(int id) {
            Usuario p = repositorio.findById(id);
            if (p!=null)
            {
                repositorio.delete(p);
            }
            return p;
	}

  
}

