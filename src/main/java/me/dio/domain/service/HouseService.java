package me.dio.domain.service;

import me.dio.domain.model.House;

public interface HouseService {

    House findById(Long id);

    House create(House houseToCreate);
}
