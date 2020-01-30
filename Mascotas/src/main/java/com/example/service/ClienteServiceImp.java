/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;
import com.example.dao.ClienteRepository;
import com.example.model.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class ClienteServiceImp implements ClienteService
{
@Autowired
private ClienteRepository repositorio;
  
    @Override
    public Cliente altaCliente(Cliente p) {
       return repositorio.save(p);
    }
    @Override
    public Cliente listadoDni(String dni) {
        return repositorio.findByDni(dni);
    }
   
}

