package com.udea.admitirsocio.service;

import com.udea.admitirsocio.models.Manager;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IManagerServicio {
    //GET
    @Transactional(readOnly = true)
    List<Manager> findAllManager();

    //POST
    @Transactional
    Manager saveManager(Manager manager);

    //GET ID
    @Transactional(readOnly = true)
    Manager findManager(Long id);

    @Transactional
    void deleteManager(Long id);
}
