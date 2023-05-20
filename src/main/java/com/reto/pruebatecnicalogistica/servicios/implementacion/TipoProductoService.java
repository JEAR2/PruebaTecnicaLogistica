package com.reto.pruebatecnicalogistica.servicios.implementacion;

import com.reto.pruebatecnicalogistica.entidades.TipoProducto;
import com.reto.pruebatecnicalogistica.repositorios.TipoProductoRepository;
import com.reto.pruebatecnicalogistica.servicios.interfaces.ITipoProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoProductoService implements ITipoProductoService {
    @Autowired
    private TipoProductoRepository tipoProductoRepository;
    @Override
    public List<TipoProducto> ObtenerTiposProducto() {

        return tipoProductoRepository.findAll();
    }

    @Override
    public Optional<TipoProducto> ObtenerTipoProductoPorId(Long id) {
        return tipoProductoRepository.findById(id);
    }

    @Override
    public TipoProducto CrearTipoProducto(TipoProducto tipoProducto) {

        return tipoProductoRepository.save(tipoProducto);
    }

    @Override
    public TipoProducto ActualizarTipoProducto(Long id, TipoProducto tipoProducto) {

        return tipoProductoRepository.save(tipoProducto);
    }

    @Override
    public void EliminarTipoProducto(Long id) {
        tipoProductoRepository.deleteById(id);
    }
}
