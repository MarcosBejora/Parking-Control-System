package com.api.parkingcontrol.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.parkingcontrol.models.ParkingSpotModel;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
	
	boolean existsByPlacaVeiculo(String placaVeiculo);
	boolean existsByNumeroDaVaga(String numeroDaVaga);
	boolean existsByBlocoAndApartamento(String bloco, String apartamento);
	
}
