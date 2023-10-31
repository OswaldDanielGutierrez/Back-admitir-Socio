package com.udea.admitirsocio.repository;

import com.udea.admitirsocio.models.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepositorio extends JpaRepository <Manager, Long> {
}
