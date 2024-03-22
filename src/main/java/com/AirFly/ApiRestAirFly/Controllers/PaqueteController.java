package com.AirFly.ApiRestAirFly.Controllers;

import com.AirFly.ApiRestAirFly.Services.PaqueteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.AirFly.ApiRestAirFly.Models.Entitys.Paquete;

import java.util.List;

@RestController
@RequestMapping("/api-airfly.com")
public class PaqueteController {

    @Autowired
    private PaqueteService service;


    @GetMapping("paquetes")
    public List<Paquete> obtenerPaquetes(){
        return service.obtenerPaquetes();
    }

    @GetMapping("paquete/{id}")
    public Paquete obtenerPaquete(@PathVariable int id){
        return service.obtenerPaquete(id);
    }

    @PostMapping("paquete")
    public Paquete nuevoPaquete(@RequestBody Paquete paquete){
        return service.nuevoPaquete(paquete);
    }

    @PutMapping("paquete")
    public Paquete actualizarPaquete(@RequestBody int id, Paquete paquete){
        return service.actualizarPaquete(id, paquete);
    }

    @DeleteMapping("paquete/{id}")
    public void eliminarPaquete(@PathVariable int id){
        service.eliminarPaquete(id);
    }
}
