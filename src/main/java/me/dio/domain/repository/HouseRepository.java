package me.dio.domain.repository;

import me.dio.domain.model.House;
import me.dio.domain.model.Number;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends JpaRepository<House, Long> {
}
