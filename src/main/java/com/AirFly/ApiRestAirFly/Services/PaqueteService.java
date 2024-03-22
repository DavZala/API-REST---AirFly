package com.AirFly.ApiRestAirFly.Services;

import com.AirFly.ApiRestAirFly.Models.DAO.PaqueteDao;
import com.AirFly.ApiRestAirFly.Models.Entitys.Paquete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaqueteService implements IPaquete{

    @Autowired
    private PaqueteDao repository;

    @Override
    public List<Paquete> obtenerPaquetes() {
        return (List<Paquete>) repository.findAll();
    }
    @Override
    public Paquete obtenerPaquete(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Paquete nuevoPaquete(Paquete paquete) {
        return repository.save(paquete);
    }

    @Override
    public Paquete actualizarPaquete(int id, Paquete paquete) {
        Paquete paqueteAux = obtenerPaquete(id);
        if (paqueteAux != null){
            return repository.save(paquete);
        }else{
            System.out.println("No se encontro el paquete que quiere actualizar");
            return null;
        }
    }
    @Override
    public void eliminarPaquete(int id) {
        boolean existe = repository.existsById(id);
        if (existe){
            repository.deleteById(id);
        }else{
            System.out.println("No se encontro el paquete que quiere eliminar.");
        }

    }
}
