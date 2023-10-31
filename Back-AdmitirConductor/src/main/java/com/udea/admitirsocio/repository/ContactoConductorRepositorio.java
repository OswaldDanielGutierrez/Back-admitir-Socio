package com.udea.admitirsocio.repository;

import com.udea.admitirsocio.models.ContactoConductor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoConductorRepositorio extends JpaRepository <ContactoConductor, Long> {
}
