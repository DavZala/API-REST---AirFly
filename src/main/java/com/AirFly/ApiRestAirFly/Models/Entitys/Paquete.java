package com.AirFly.ApiRestAirFly.Models.Entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="paquetes")
public class Paquete{

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String pais;
    private String ref_1;
    private String ref_2;
    private String ref_3;
    private String ref_4;
    private int estrellas;
    private String descripcion_1;
    private String descripcion_2;
    private String descripcion_ubicacion;
    private double costo;
}
