package com.example.retoPractico_CivaJoseAhumada.dto;

import com.example.retoPractico_CivaJoseAhumada.entity.Marca;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.ToString;

import java.time.LocalDateTime;

public record BusListarDto(
         Integer id,
         String numeroBus,
         String placa,
         LocalDateTime fechaCreacion,
         String caracteristicas,
         String marca, // Se envía el nombre en lugar del ID
         Boolean activo

) {
}
