package com.udea.admitirsocio.service;

import com.udea.admitirsocio.models.Conductor;

import java.util.List;

public interface IConductorServicio {
    List<Conductor> findAllConductor();

    Conductor saveConductor(Conductor conductor);

    Conductor getConductor(Long id);

    void deleteConductor(Long id);
}
