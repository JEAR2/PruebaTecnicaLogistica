package com.reto.pruebatecnicalogistica.servicios.implementacion;

import com.reto.pruebatecnicalogistica.entidades.Cliente;
import com.reto.pruebatecnicalogistica.repositorios.ClienteRepository;
import com.reto.pruebatecnicalogistica.servicios.interfaces.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private ClienteRepository clienteRepository;



    @Override
    public List<Cliente> ObtenerClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> ObtenerClientePorId(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public Cliente CrearCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente ActualizarCliente(Long id, Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public void EliminarCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
