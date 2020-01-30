
package com.example.service;

import com.example.model.Usuario;
import java.util.List;
import org.springframework.context.annotation.ComponentScan;


public interface UsuarioService {
List<Usuario>listadoUsuarios();
Usuario altaUsuario(Usuario p);
Usuario editarUsuario(Usuario p);
Usuario eliminarUsuario(int id);
Usuario UsuarioUnico(int id);
Usuario comprobarLogin(String usuario,String pass);

}
