package com.portfolio.portfoliologin.security.Service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfoliologin.security.Entity.Rol;
import com.portfolio.portfoliologin.security.Enums.RolNombre;
import com.portfolio.portfoliologin.security.Repository.IRolRepository;


@Service
@Transactional
public class RolService {
      
	@Autowired
	IRolRepository irolRepository;
	
	public Optional<Rol> getByRolNombre(RolNombre rolNombre){
		return irolRepository.findByRolNombre(rolNombre);
	}
	
	public void save (Rol rol) {
		irolRepository.save(rol);
	}
	
	
}
