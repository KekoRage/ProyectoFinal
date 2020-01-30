
package com.example.service;

import com.example.model.Animal;
import java.util.List;



public interface AnimalService {
List<Animal>listadoAnimales();
Animal altaAnimal(Animal p);
Animal editarAnimal(Animal p);
Animal eliminarAnimal(int id);
List<Animal>AnimalUnicoTipo(String tipo);
Animal AnimalUnicoId(int id);
List<String>listadoTipos();
}
