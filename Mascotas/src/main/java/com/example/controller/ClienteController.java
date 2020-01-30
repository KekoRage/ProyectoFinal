package com.example.controller;

import com.example.model.Cliente;
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
import com.example.service.ClienteService;

@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping
public class ClienteController {
	@Autowired
	ClienteService service;

@PostMapping("/clientes")
public Cliente agregar(@RequestBody Cliente p){
   return service.altaCliente(p); 
}
@GetMapping({"/clientes/{dni}"})
public Cliente listarId(@PathVariable("dni") String dni)
{
    return service.listadoDni(dni);
}
}
