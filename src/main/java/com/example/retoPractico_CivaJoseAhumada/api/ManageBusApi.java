package com.example.retoPractico_CivaJoseAhumada.api;

import com.example.retoPractico_CivaJoseAhumada.dto.BusListarDto;
import com.example.retoPractico_CivaJoseAhumada.response.FindBusResponse;
import com.example.retoPractico_CivaJoseAhumada.response.FindBusesResponse;
import com.example.retoPractico_CivaJoseAhumada.service.MaintenanceBusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/m-bus")
@CrossOrigin(origins = "http://localhost:5173")
public class ManageBusApi {

     @Autowired
    MaintenanceBusService maintenanceBusService;

    @GetMapping("/")
    public FindBusesResponse findBuses(){

        try {
            List<BusListarDto> buses = maintenanceBusService.getAllBuses();

            if(!buses.isEmpty())
                return new FindBusesResponse("01",null,buses);
            else
                return new FindBusesResponse("02","Buses not found",null);

        } catch (Exception e) {
            e.printStackTrace();
            return new FindBusesResponse("99","An error ocurred, please try again",null);
        }

    }

    @GetMapping("/{id}")
    public FindBusResponse findBus(@PathVariable("id") int id){

        try {
            Optional<BusListarDto> optional = maintenanceBusService.getBusById(id);
            return optional.map(bus ->
                    new FindBusResponse("01", null, bus)
            ).orElse(
                    new FindBusResponse("02","Bus not found",null)
            );

        } catch (Exception e) {
            e.printStackTrace();
            return new FindBusResponse("99","An error ocurred, please try again",null);
        }

    }


}
