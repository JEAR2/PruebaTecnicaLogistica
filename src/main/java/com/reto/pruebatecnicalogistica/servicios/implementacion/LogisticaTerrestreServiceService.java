package com.reto.pruebatecnicalogistica.servicios.implementacion;


import com.reto.pruebatecnicalogistica.entidades.LogisticaTerrestre;
import com.reto.pruebatecnicalogistica.repositorios.LogisticaTerrestreRepository;
import com.reto.pruebatecnicalogistica.servicios.interfaces.ILogisticaTerrestreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LogisticaTerrestreServiceService implements ILogisticaTerrestreService {
    @Autowired
    private LogisticaTerrestreRepository logisticaTerrestreRepository;
    @Override
    public List<LogisticaTerrestre> ObtenerLogisticaTerrestre() {

        return logisticaTerrestreRepository.findAll();
    }

    @Override
    public Optional<LogisticaTerrestre> ObtenerLogisticaTerrestrePorId(Long id) {

        return logisticaTerrestreRepository.findById(id);
    }

    @Override
    public LogisticaTerrestre CrearLogisticaTerrestre(LogisticaTerrestre logisticaCamiones) {

        return logisticaTerrestreRepository.save(logisticaCamiones);
    }

    @Override
    public LogisticaTerrestre ActualizarLogisticaTerrestre(Long id, LogisticaTerrestre logisticaCamiones) {

        return logisticaTerrestreRepository.save(logisticaCamiones);
    }

    @Override
    public void EliminarLogisticaTerrestre(Long id) {
        logisticaTerrestreRepository.deleteById(id);
    }
}
