package com.reto.pruebatecnicalogistica.servicios.implementacion;


import com.reto.pruebatecnicalogistica.entidades.Bodega;
import com.reto.pruebatecnicalogistica.repositorios.BodegaRepository;
import com.reto.pruebatecnicalogistica.servicios.interfaces.IBodegaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BodegaService implements IBodegaService {

    @Autowired
    private BodegaRepository bodegaRepository;

    @Override
    public List<Bodega> ObtenerBodegas() {
        return bodegaRepository.findAll();
    }

    @Override
    public Optional<Bodega> ObtenerBodegaPorId(Long id) {
        return bodegaRepository.findById(id);
    }

    @Override
    public Bodega CrearBodega(Bodega bodega) {
        return bodegaRepository.save(bodega);
    }

    @Override
    public Bodega ActualizarBodega(Long id, Bodega bodega) {
        return bodegaRepository.save(bodega);
    }

    @Override
    public void EliminarBodega(Long id) {
        bodegaRepository.deleteById(id);
    }
}
