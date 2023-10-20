package me.dio.domain.controller;

import me.dio.domain.model.House;
import me.dio.domain.service.HouseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/houses")
public class HouseController {
    private final HouseService houseService;

    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<House> findById(@PathVariable Long id){
        var house = houseService.findById(id);
        return ResponseEntity.ok(house);
    }

    @PostMapping
    public ResponseEntity<House> create(@RequestBody House houseToCreate){
        var houseCreated = houseService.create(houseToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(houseCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(houseCreated);
    }
}
