package me.dio.domain.service.houseserviceimpl;

import me.dio.domain.model.House;
import me.dio.domain.repository.HouseRepository;
import me.dio.domain.service.HouseService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class HouseServiceImpl implements HouseService {

    private final HouseRepository houseRepository;


    public HouseServiceImpl(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    @Override
    public House findById(Long id) {
        return houseRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public House create(House houseToCreate){
        if (houseToCreate.getId() != null && houseRepository.existsById(houseToCreate.getId())){
            throw new IllegalArgumentException("This Number already exists.");
        }
        return houseRepository.save(houseToCreate);
    }
}

