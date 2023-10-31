package com.udea.admitirsocio.repository;

import com.udea.admitirsocio.models.InfoBancaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoBancariaRepositorio extends JpaRepository <InfoBancaria, Long> {
}
