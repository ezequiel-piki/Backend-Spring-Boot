package com.portfolio.portfoliologin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfoliologin.model.Habilidad;

import com.portfolio.portfoliologin.repo.HabilidadRepo;

@Service
public class HabilidadService implements IHabilidadService{

	@Autowired HabilidadRepo habilidadRepo;
	
	
	@Override
	public List<Habilidad> getHabilidad() {
		List<Habilidad> habilidad = habilidadRepo.findAll();
		return habilidad;
	}

	@Override
	public void saveHabilidad(Habilidad habilidad) {
		
		habilidadRepo.save(habilidad);
	}

	@Override
	public void deletehabilidadById(String id) {
		habilidadRepo.deleteById(id);
		
	}

	@Override
	public Habilidad findHabilidadById(String id) {
		Habilidad habilidad = habilidadRepo.findById(id).orElse(null);
		return habilidad;
	}

}
