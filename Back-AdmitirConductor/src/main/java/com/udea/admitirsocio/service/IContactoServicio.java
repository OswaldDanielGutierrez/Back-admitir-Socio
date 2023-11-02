package com.udea.admitirsocio.service;

import com.udea.admitirsocio.jpa.models.Contacto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IContactoServicio {
    @Transactional(readOnly = true)
    List<Contacto> findAllContacto();

    //POST
    @Transactional
    Contacto saveContacto(Contacto contacto);

    //GET ID
    @Transactional(readOnly = true)
    Contacto findContacto(Long id);

    //DELETE
    @Transactional
    void deleteContacto(Long id);
}
