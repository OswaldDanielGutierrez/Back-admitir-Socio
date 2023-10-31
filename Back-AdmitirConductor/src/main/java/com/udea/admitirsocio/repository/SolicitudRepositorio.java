package com.udea.admitirsocio.repository;

import com.udea.admitirsocio.models.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitudRepositorio extends JpaRepository <Solicitud, Long> {
}
