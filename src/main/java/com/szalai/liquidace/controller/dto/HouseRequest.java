package com.szalai.liquidace.controller.dto;

public record HouseRequest (
        String address,
        String city,
        Long price) {}
