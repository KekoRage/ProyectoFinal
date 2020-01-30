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

import com.example.dao.AnimalRepository;
import com.example.model.Animal;

@Service
public class AnimalServiceImp implements AnimalService
{
@Autowired
private AnimalRepository repositorio;
    @Override
    public List<Animal> listadoAnimales() {
        return repositorio.findAll();
    }

    @Override
    public Animal altaAnimal(Animal p) {
       return repositorio.save(p);
    }

    @Override
    public Animal editarAnimal(Animal p) {
       return repositorio.save(p);
    }

    @Override
    public Animal eliminarAnimal(int id) {
         Animal p = repositorio.findById(id);
            if (p!=null)
            {
                repositorio.delete(p);
            }
            return p;
    }

    @Override
    public List<Animal> AnimalUnicoTipo(String tipo) {
        return repositorio.findByTipo(tipo);
    }
    @Override
    public Animal AnimalUnicoId(int id) {
        return repositorio.findById(id);
    }
    @Override
    public List<String> listadoTipos() {
        return repositorio.findAllTipos();
    }
}

