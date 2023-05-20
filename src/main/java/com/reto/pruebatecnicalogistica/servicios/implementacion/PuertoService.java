package com.reto.pruebatecnicalogistica.servicios.implementacion;

import com.reto.pruebatecnicalogistica.entidades.Puerto;
import com.reto.pruebatecnicalogistica.repositorios.PuertoRepository;
import com.reto.pruebatecnicalogistica.servicios.interfaces.IPuertoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PuertoService implements IPuertoService {
    @Autowired
    private PuertoRepository puertoRepository;
    @Override
    public List<Puerto> ObtenerPuertos() {
        return puertoRepository.findAll();
    }

    @Override
    public Optional<Puerto> ObtenerPuertoPorId(Long id) {
        return puertoRepository.findById(id);
    }

    @Override
    public Puerto CrearPuerto(Puerto puerto) {
        return puertoRepository.save(puerto);
    }

    @Override
    public Puerto ActualizarPuerto(Long id, Puerto puerto) {
        return puertoRepository.save(puerto);
    }

    @Override
    public void EliminarPuerto(Long id) {
        puertoRepository.deleteById(id);
    }
}
