package com.example.retoPractico_CivaJoseAhumada.response;

import com.example.retoPractico_CivaJoseAhumada.dto.BusListarDto;

import java.util.List;

public record FindBusesResponse(String code,
                                String error,
                                List<BusListarDto> buses) {
}
