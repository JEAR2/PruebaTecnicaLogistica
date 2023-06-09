package com.reto.pruebatecnicalogistica.controladores;



import com.reto.pruebatecnicalogistica.entidades.LogisticaMaritima;
import com.reto.pruebatecnicalogistica.servicios.implementacion.LogisticaMaritimaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/logistica/maritima")
public class LogisticaMaritimaController {
    @Autowired
    private LogisticaMaritimaService logisticaMaritimaService;

    @GetMapping(value = "/todos")
    public List<LogisticaMaritima> ObtenerLogisticaMaritima(){
        return logisticaMaritimaService.ObtenerLogisticaMaritima();
    }

    @PostMapping(value = "/guardar")
    public ResponseEntity<LogisticaMaritima> guardarLogisticaMaritima(@RequestBody LogisticaMaritima logisticaMaritima){
        LogisticaMaritima logisticaMaritimaGuardar =  logisticaMaritimaService.CrearLogisticaMaritima(logisticaMaritima);
        return new ResponseEntity<>(logisticaMaritimaGuardar, HttpStatus.OK);
    }



    @GetMapping(path = "/obtener/{id}")
    public Optional<LogisticaMaritima> encontrarLogisticaMaritimaPorId(@PathVariable("id") Long id){

        return logisticaMaritimaService.ObtenerLogisticaMaritimaPorId(id);
    }

    @PutMapping(value = "/actualizar/{id}")
    public ResponseEntity<LogisticaMaritima> actualizarLogisticaMaritima(@RequestBody LogisticaMaritima logisticaMaritima,@PathVariable("id") Long id ){

        return new ResponseEntity<LogisticaMaritima>(logisticaMaritimaService.ActualizarLogisticaMaritima(id,logisticaMaritima), HttpStatus.OK);
    }

    @DeleteMapping(value = "/eliminar/{id}")
    public ResponseEntity<Void> eliminarLogisticaCamiones(@PathVariable Long id){
        Optional logisticaMaritima = null;
        logisticaMaritima = logisticaMaritimaService.ObtenerLogisticaMaritimaPorId(id);
        if(logisticaMaritima.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        logisticaMaritimaService.EliminarLogisticaMaritima(id);
        return ResponseEntity.ok().build();
    }
}
