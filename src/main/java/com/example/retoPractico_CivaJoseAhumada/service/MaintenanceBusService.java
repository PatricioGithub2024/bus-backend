package com.example.retoPractico_CivaJoseAhumada.service;

import com.example.retoPractico_CivaJoseAhumada.dto.BusListarDto;

import java.util.List;
import java.util.Optional;

public interface MaintenanceBusService {

    //creacion de metodos listar y listar por ID

    //listar buses
    List<BusListarDto> getAllBuses() throws Exception;

    //listar buses por ID
    Optional<BusListarDto> getBusById(int id) throws Exception;


}
