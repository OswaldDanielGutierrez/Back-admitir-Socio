package com.udea.admitirsocio.service;

import com.udea.admitirsocio.models.Solicitud;
import com.udea.admitirsocio.repository.SolicitudRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SolicitudImplementacion implements ISolicitudServicio{

    @Autowired
    private SolicitudRepositorio solicitudRepositorio;

    //GET
    @Override
    @Transactional(readOnly = true)
    public List<Solicitud> findAllSolicitud() {return solicitudRepositorio.findAll();}

    //POST
    @Override
    @Transactional
    public Solicitud saveSolicitud(Solicitud solicitud) {return  solicitudRepositorio.save(solicitud);}

    //GET ID
    @Override
    @Transactional(readOnly = true)
    public Solicitud findSolicitud(Long id) {return solicitudRepositorio.findById(id).orElse(null);}

    //DELETE
    @Override
    @Transactional
    public void deleteSolicitud(Long id) { solicitudRepositorio.deleteById(id);}
}
