package com.udea.admitirsocio.jpa.repository;

import com.udea.admitirsocio.jpa.models.Documentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentosRepositorio extends JpaRepository <Documentos, Long> {
}
