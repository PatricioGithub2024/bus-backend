package com.example.retoPractico_CivaJoseAhumada.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Date;

@Entity(name = "bus")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bus {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numeroBus;
    private String placa;
    @Column(name = "fecha_creacion", nullable = false, updatable = false)
    private LocalDateTime fechaCreacion = LocalDateTime.now();
    private String caracteristicas;
    private Boolean activo = true;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca;


}
