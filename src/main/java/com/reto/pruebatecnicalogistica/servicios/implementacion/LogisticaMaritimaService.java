package com.reto.pruebatecnicalogistica.servicios.implementacion;

import com.reto.pruebatecnicalogistica.entidades.LogisticaMaritima;
import com.reto.pruebatecnicalogistica.repositorios.LogisticaMaritimaRepository;
import com.reto.pruebatecnicalogistica.servicios.interfaces.ILogisticaMaritimaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LogisticaMaritimaService implements ILogisticaMaritimaService {
    @Autowired
    private LogisticaMaritimaRepository logisticaMaritimaRepository;
    @Override
    public List<LogisticaMaritima> ObtenerLogisticaMaritima() {

        return logisticaMaritimaRepository.findAll();
    }

    @Override
    public Optional<LogisticaMaritima> ObtenerLogisticaMaritimaPorId(Long id) {

        return logisticaMaritimaRepository.findById(id);
    }

    @Override
    public LogisticaMaritima CrearLogisticaMaritima(LogisticaMaritima logisticaMaritima) {

        return logisticaMaritimaRepository.save(logisticaMaritima);
    }

    @Override
    public LogisticaMaritima ActualizarLogisticaMaritima(Long id, LogisticaMaritima logisticaMaritima) {

        return logisticaMaritimaRepository.save(logisticaMaritima);
    }

    @Override
    public void EliminarLogisticaMaritima(Long id) {
        logisticaMaritimaRepository.deleteById(id);
    }
}
