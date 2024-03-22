package com.AirFly.ApiRestAirFly.Services;

import com.AirFly.ApiRestAirFly.Models.DAO.PaqueteDao;
import com.AirFly.ApiRestAirFly.Models.Entitys.Paquete;

import java.util.List;

public interface IPaquete {

    public List<Paquete> obtenerPaquetes();
    public Paquete obtenerPaquete(int id);
    public Paquete nuevoPaquete(Paquete paquete);
    public Paquete actualizarPaquete(Paquete paquete);
    public void eliminarPaquete (int id);


}
