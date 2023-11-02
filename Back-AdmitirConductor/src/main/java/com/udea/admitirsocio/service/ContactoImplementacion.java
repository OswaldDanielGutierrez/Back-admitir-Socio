package com.udea.admitirsocio.service;

import com.udea.admitirsocio.jpa.models.Contacto;
import com.udea.admitirsocio.jpa.repository.ContactoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ContactoImplementacion implements IContactoServicio {

    @Autowired
    private ContactoRepositorio contactoRepositorio;

    //GET
    @Override
    @Transactional(readOnly = true)
    public List<Contacto> findAllContacto() { return contactoRepositorio.findAll();}

    //POST
    @Override
    @Transactional
    public Contacto saveContacto (Contacto contacto) {return contactoRepositorio.save(contacto);}

    //GET ID
    @Override
    @Transactional(readOnly = true)
    public Contacto findContacto (Long id) {return contactoRepositorio.findById(id).orElse(null);}

    //DELETE
    @Override
    @Transactional
    public void deleteContacto (Long id) {contactoRepositorio.deleteById(id);}

}
