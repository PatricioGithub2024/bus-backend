package com.example.retoPractico_CivaJoseAhumada.service.impl;

import com.example.retoPractico_CivaJoseAhumada.dto.BusListarDto;
import com.example.retoPractico_CivaJoseAhumada.entity.Bus;
import com.example.retoPractico_CivaJoseAhumada.repository.BusRepository;
import com.example.retoPractico_CivaJoseAhumada.service.MaintenanceBusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class MaintenanceBusServiceImpl implements MaintenanceBusService {

    @Autowired
    private BusRepository busRepository;


    @Override
    public List<BusListarDto> getAllBuses() throws Exception {

        List<BusListarDto> busesDtoListar = new ArrayList<>();
        Iterable<Bus> iterable = busRepository.findAll();
        iterable.forEach(bus -> {
            BusListarDto busListar = new BusListarDto(
                    bus.getId(),
                    bus.getNumeroBus(),
                    bus.getPlaca(),
                    bus.getFechaCreacion(),
                    bus.getCaracteristicas(),
                    bus.getMarca().getNombre(),
                    bus.getActivo()

            );
            busesDtoListar.add(busListar);

        });
        return busesDtoListar;

    }

    @Override
    public Optional<BusListarDto> getBusById(int id) throws Exception {

        Optional<Bus> optionalBus = busRepository.findById(id);
        return optionalBus.map(bus -> new BusListarDto(
                bus.getId(),
                bus.getNumeroBus(),
                bus.getPlaca(),
                bus.getFechaCreacion(),
                bus.getCaracteristicas(),
                bus.getMarca().getNombre(),
                bus.getActivo()
        ));

    }
}
