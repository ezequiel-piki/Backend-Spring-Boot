package com.portfolio.portfoliologin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.portfoliologin.model.Habilidad;
import com.portfolio.portfoliologin.repo.HabilidadRepo;

import com.portfolio.portfoliologin.service.HabilidadService;


@RestController
@RequestMapping("/habilidad")
@CrossOrigin(origins = "http://localhost:4200")
public class HabilidadController {
	
	@Autowired
    private HabilidadService habilidadService;
    
     
	@Autowired
     private HabilidadRepo habilidadRepo;
   
   @GetMapping("/list")
   public List<Habilidad> getHabilidad() {
	return	habilidadService.getHabilidad();	
	}
   
   @PostMapping("/newHabilidad")
   public String createHabilidad(@RequestBody Habilidad habilidad) {
   	habilidadService.saveHabilidad(habilidad);
   	return "La habilidad se creo de forma correcta";
   }
   
   @DeleteMapping("/delete/id")
   public String deleteUserByID(@PathVariable String id) {
   habilidadService.deletehabilidadById(id);
   return "La habilidad se elimino de forma correcta";
   }

   @GetMapping("/searchHabilidad")
   public Habilidad findHabilidad() {
   return habilidadService.findHabilidadById((String)"Autopartes Primera"); 	
   }
}
