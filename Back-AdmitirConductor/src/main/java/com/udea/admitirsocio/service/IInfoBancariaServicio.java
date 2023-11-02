package com.udea.admitirsocio.service;

import com.udea.admitirsocio.jpa.models.InfoBancaria;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IInfoBancariaServicio {
    //GET
    @Transactional(readOnly = true)
    List<InfoBancaria> findAllInfoBancaria();


    //POST
    @Transactional
    InfoBancaria saveInfoBancaria(InfoBancaria infoBancaria);

    //GET ID
    @Transactional(readOnly = true)
    InfoBancaria findInfoBancaria(Long id);

    //DELETE
    @Transactional
    void deleteInfoBancaria(Long id);
}
