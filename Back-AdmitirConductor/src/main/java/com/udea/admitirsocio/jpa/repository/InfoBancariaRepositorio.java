package com.udea.admitirsocio.jpa.repository;

import com.udea.admitirsocio.jpa.models.InfoBancaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoBancariaRepositorio extends JpaRepository <InfoBancaria, Long> {
}
