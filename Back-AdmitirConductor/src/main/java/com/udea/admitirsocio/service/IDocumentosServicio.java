package com.udea.admitirsocio.service;

import com.udea.admitirsocio.jpa.models.Documentos;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IDocumentosServicio {
    //GET
    @Transactional(readOnly = true)
    List<Documentos> findAllDocumentos();

    //POST
    @Transactional
    Documentos saveDocumento (Documentos documentos);

    //GET ID
    @Transactional(readOnly = true)
    Documentos findDocumento(Long id);

    //DELETE
    @Transactional
    void deleteDocumento(Long id);
}
