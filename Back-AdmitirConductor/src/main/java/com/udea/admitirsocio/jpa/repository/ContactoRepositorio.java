package com.udea.admitirsocio.jpa.repository;

import com.udea.admitirsocio.jpa.models.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepositorio extends JpaRepository<Contacto, Long> {
}
