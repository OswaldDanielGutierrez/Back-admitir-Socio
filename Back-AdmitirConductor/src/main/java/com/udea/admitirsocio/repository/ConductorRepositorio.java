package com.udea.admitirsocio.repository;


import com.udea.admitirsocio.models.Conductor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConductorRepositorio extends JpaRepository< Conductor, Long>{

}
