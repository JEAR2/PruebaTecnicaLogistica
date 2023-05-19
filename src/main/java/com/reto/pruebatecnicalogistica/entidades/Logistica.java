package com.reto.pruebatecnicalogistica.entidades;

import lombok.Data;

import java.util.Date;
@Data

public abstract class Logistica {
    private int cantidadProducto;
    private Date fechaRegistro;
    private Date fechaEntrega;
    private Double precioEnvio;
    private String numeroGuia;

    public Logistica() {
    }

    abstract String getNumeroGuia();

}
