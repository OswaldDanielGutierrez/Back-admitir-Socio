package com.udea.admitirsocio.jpa.repository;

import com.udea.admitirsocio.jpa.models.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepositorio extends JpaRepository <Manager, Long> {
}
