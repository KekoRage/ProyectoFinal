package com.example.controller;

import com.example.model.Usuario;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.service.UsuarioService;
import com.example.service.UsuarioService;

@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping
public class UsuarioController {
	@Autowired
	UsuarioService service;
@GetMapping("/usuarios")
public List<Usuario>listar()
{
	return service.listadoUsuarios();
}
@PostMapping("/usuarios")
public Usuario agregar(@RequestBody Usuario p){
   return service.altaUsuario(p); 
}
@GetMapping({"/usuarios/{id}"})
public Usuario listarId(@PathVariable("id") int id)
{
    return service.UsuarioUnico(id);
}
@PutMapping(path={"/usuarios/{id}"})
public Usuario editar(@RequestBody Usuario p, @PathVariable("id") int id)
{
    p.setId(id);
    return service.editarUsuario(p);
}  
@DeleteMapping(path={"/usuarios/{id}"})
public Usuario delete(@PathVariable ("id") int id)
{
    return service.eliminarUsuario(id);
}

@GetMapping({"/usuarios/{usuario}/{pass}"})
public Usuario comprobarLogin(@PathVariable("usuario") String usuario, @PathVariable("pass") String pass)
{
    return service.comprobarLogin(usuario, pass);
}
}
