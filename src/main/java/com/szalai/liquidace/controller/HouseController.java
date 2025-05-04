package com.szalai.liquidace.controller;

import com.szalai.liquidace.controller.dto.HouseRequest;
import com.szalai.liquidace.service.HouseService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/houses")
public class HouseController {

    private final HouseService houseService;

    @PostMapping
    public ResponseEntity<Void> addHouse(@Valid @RequestBody HouseRequest request) {
        houseService.addHouse(request);
        return ResponseEntity.status(200).build();
    }
}
