package com.szalai.liquidace.service;

import com.szalai.liquidace.controller.dto.HouseRequest;
import com.szalai.liquidace.model.House;
import com.szalai.liquidace.repository.HouseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class HouseService {

    private final HouseRepository houseRepository;

    public void addHouse(HouseRequest request) {
        try {
            houseRepository.save(new House(
                    UUID.randomUUID().toString(),
                    request.address(),
                    request.city(),
                    request.price(),
                    System.currentTimeMillis()));
        } catch (Exception e) {
            log.error("Exception happened during saving to the database", e);

        }
    }
}
