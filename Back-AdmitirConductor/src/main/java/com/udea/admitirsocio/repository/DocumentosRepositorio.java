package com.udea.admitirsocio.repository;

import com.udea.admitirsocio.models.Documentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentosRepositorio extends JpaRepository <Documentos, Long> {
}
