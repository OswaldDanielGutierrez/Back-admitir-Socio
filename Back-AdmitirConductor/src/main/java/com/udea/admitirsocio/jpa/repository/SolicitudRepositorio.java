package com.udea.admitirsocio.jpa.repository;

import com.udea.admitirsocio.jpa.models.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitudRepositorio extends JpaRepository <Solicitud, Long> {
}
