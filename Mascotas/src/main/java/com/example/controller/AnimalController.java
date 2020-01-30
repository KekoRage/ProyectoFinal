package com.example.controller;

import com.example.model.Animal;
import com.example.model.Usuario;
import com.example.service.AnimalService;
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


@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping
public class AnimalController {
	@Autowired
	AnimalService service;
@GetMapping("/animales")
public List<Animal>listar()
{
	return service.listadoAnimales();
}
@PostMapping("/animales")
public Animal agregar(@RequestBody Animal p){
   return service.altaAnimal(p); 
}
@GetMapping({"/animales/tipo/{tipo}"})
public List<Animal>listarTipo(@PathVariable("tipo") String tipo)
{
    return service.AnimalUnicoTipo(tipo);
}
@GetMapping({"/animales/{id}"})
public Animal listarId(@PathVariable("id") int id)
{
    return service.AnimalUnicoId(id);
}


@PutMapping(path={"/animales/{id}"})
public Animal editar(@RequestBody Animal p, @PathVariable("id") int id)
{
    p.setId(id);
    return service.editarAnimal(p);
}  
@DeleteMapping(path={"/animales/{id}"})
public Animal delete(@PathVariable ("id") int id)
{
    return service.eliminarAnimal(id);
}
@GetMapping("/animales/tipos")
public List<String>listarTipo()
{
	return service.listadoTipos();
}
}
