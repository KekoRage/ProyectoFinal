/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;
import com.example.model.Usuario;
import java.util.List;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.Repository;



public interface UsuarioRepository extends Repository<Usuario,Integer>{
List<Usuario>findAll();
Usuario findById(int id);
//Usuario findByNombre(String nombre);
Usuario save(Usuario p);
void delete(Usuario p);
Usuario findByUsuarioAndPassword(String usuario, String pass);
}
