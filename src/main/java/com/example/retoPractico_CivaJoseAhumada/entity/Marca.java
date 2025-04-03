package com.example.retoPractico_CivaJoseAhumada.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Marca {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    @ToString.Exclude
    @OneToMany(mappedBy = "marca", cascade = CascadeType.ALL)
    private List<Bus> buses;

}
