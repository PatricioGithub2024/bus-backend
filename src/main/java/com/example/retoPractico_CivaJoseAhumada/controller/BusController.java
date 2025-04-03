package com.example.retoPractico_CivaJoseAhumada.controller;

import com.example.retoPractico_CivaJoseAhumada.dto.BusListarDto;
import com.example.retoPractico_CivaJoseAhumada.service.MaintenanceBusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/bus")
public class BusController {

    @Autowired
    MaintenanceBusService maintenanceBusService;

    @GetMapping("/")
    public String listarBuses(Model model) {

        try {
            List<BusListarDto> buses = maintenanceBusService.getAllBuses();
            model.addAttribute("buses", buses);

        }catch (Exception e) {

            e.printStackTrace();
            model.addAttribute("error", "Ocurrio un error al obtener los datos de la busqueda");
        }

        return "buses-listar";
    }

    @GetMapping("/{id}")
    public String getBusById(@PathVariable int id, Model model) throws Exception {

        Optional<BusListarDto> bus = maintenanceBusService.getBusById(id);

        if (bus.isPresent()) {
            model.addAttribute("buses", bus.get());
        } else {
            model.addAttribute("error", "Bus no encontrado con ID: " + id);
        }

        return "buses-listar"; // Nombre de la vista Thymeleaf (bus-detalle.html)
    }

}
