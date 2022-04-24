package com.durex.ponto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.durex.ponto.entities.Tank;

public interface TankRepository extends JpaRepository<Tank, Integer> {

}
