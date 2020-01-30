/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;
import com.example.model.Cliente;
import java.util.List;

import org.springframework.data.repository.Repository;



public interface ClienteRepository extends Repository<Cliente,Integer>{

Cliente findByDni(String dni);
Cliente save(Cliente p);

}
  