package com.reto.pruebatecnicalogistica.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "logisticaTerrestre")
public class LogisticaTerrestre extends Logistica{
    @Id
    private Long Id;
    private String placaVeiculo;
    private String numeroGuia;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "bodega_id")
    private Bodega bodega;
    @ManyToOne
    @JoinColumn(name = "tipo_producto_id")
    private TipoProducto tipoProducto;
    @Override
    String getNumeroGuia() {
        return null;
    }
}
