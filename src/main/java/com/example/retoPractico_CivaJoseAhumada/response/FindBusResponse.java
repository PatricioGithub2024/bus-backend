package com.example.retoPractico_CivaJoseAhumada.response;

import com.example.retoPractico_CivaJoseAhumada.dto.BusListarDto;

public record FindBusResponse(String code,
                              String error,
                              BusListarDto bus) {
}
