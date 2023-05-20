package com.reto.pruebatecnicalogistica.controladores;


import com.reto.pruebatecnicalogistica.entidades.LogisticaTerrestre;
import com.reto.pruebatecnicalogistica.servicios.implementacion.LogisticaTerrestreServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/logistica/camiones")
public class LogisticaTerrestreController {
    @Autowired
    private LogisticaTerrestreServiceService logisticaTerrestreService;

    @GetMapping(value = "/todos")
    public List<LogisticaTerrestre> ObtenerLogisticaCamiones(){
        return logisticaTerrestreService.ObtenerLogisticaTerrestre();
    }

    @PostMapping(value = "/guardar")
    public ResponseEntity<LogisticaTerrestre> guardarLogisticaCamiones(@RequestBody LogisticaTerrestre logisticaCamiones){
        LogisticaTerrestre logisticaCamionesGuardar =  logisticaTerrestreService.CrearLogisticaTerrestre(logisticaCamiones);
        return new ResponseEntity<>(logisticaCamionesGuardar, HttpStatus.OK);
    }



    @GetMapping(path = "/obtener/{id}")
    public Optional<LogisticaTerrestre> encontrarLogisticaCamionesPorId(@PathVariable("id") Long id){

        return logisticaTerrestreService.ObtenerLogisticaTerrestrePorId(id);
    }

    @PutMapping(value = "/actualizar/{id}")
    public ResponseEntity<LogisticaTerrestre> actualizarLogisticaCamiones(@RequestBody LogisticaTerrestre logisticaCamiones,@PathVariable("id") Long id ){

        return new ResponseEntity<LogisticaTerrestre>(logisticaTerrestreService.ActualizarLogisticaTerrestre(id,logisticaCamiones), HttpStatus.OK);
    }

    @DeleteMapping(value = "/eliminar/{id}")
    public ResponseEntity<Void> eliminarLogisticaCamiones(@PathVariable Long id){
        Optional logisticaCamiones = null;
        logisticaCamiones = logisticaTerrestreService.ObtenerLogisticaTerrestrePorId(id);
        if(logisticaCamiones.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        logisticaTerrestreService.EliminarLogisticaTerrestre(id);
        return ResponseEntity.ok().build();
    }
}
