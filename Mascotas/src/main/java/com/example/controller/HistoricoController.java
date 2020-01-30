package com.example.controller;

import com.example.model.Historico;
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
import com.example.service.HistoricoService;


@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping
public class HistoricoController {
	@Autowired
	HistoricoService service;
@GetMapping("/historico")
public List<Historico>listar()
{
	return service.listadoHistorico();
}
@PostMapping("/historico")
public Historico agregar(@RequestBody Historico p){
   return service.altaHistorico(p); 
}
}
