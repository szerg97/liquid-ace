package com.szalai.liquidace.controller.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PositiveOrZero;

public record HouseRequest (
        @NotEmpty String address,
        @NotEmpty String city,
        @PositiveOrZero Long price) {}
