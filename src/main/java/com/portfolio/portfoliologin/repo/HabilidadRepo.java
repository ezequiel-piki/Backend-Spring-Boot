package com.portfolio.portfoliologin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.portfoliologin.model.Habilidad;

@Repository
public interface HabilidadRepo  extends JpaRepository <Habilidad,String> {

}
