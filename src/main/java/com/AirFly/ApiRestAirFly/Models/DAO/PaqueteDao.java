package com.AirFly.ApiRestAirFly.Models.DAO;

import com.AirFly.ApiRestAirFly.Models.Entitys.Paquete;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PaqueteDao extends CrudRepository<Paquete, Integer> {

}
