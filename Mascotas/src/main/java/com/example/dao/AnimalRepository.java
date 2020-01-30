/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;
import com.example.model.Animal;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;



public interface AnimalRepository extends Repository<Animal,Integer>{
List<Animal>findAll();
List<Animal>findByTipo(String tipo);
Animal findById(int id);
Animal save(Animal p);
void delete(Animal p);
@Query("select tipo from Animal p group by p.tipo") List<String>findAllTipos();
}
  