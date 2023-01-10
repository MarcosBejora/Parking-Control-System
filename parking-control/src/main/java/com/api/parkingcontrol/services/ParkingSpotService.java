package com.api.parkingcontrol.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService {

	final ParkingSpotRepository parkingSpotRepository;

	public ParkingSpotService(ParkingSpotRepository parkingspotRepository) {
		this.parkingSpotRepository = parkingspotRepository;
	}
	@Transactional
	public Object save(ParkingSpotModel parkingSpotModel) {
		return parkingSpotRepository.save(parkingSpotModel);
	}
	public boolean existsByPlacaVeiculo(String placaVeiculo) {
		return parkingSpotRepository.existsByPlacaVeiculo(placaVeiculo);
	}

	public boolean existsByNumeroDaVaga(String numeroDaVaga) {
		return parkingSpotRepository.existsByNumeroDaVaga(numeroDaVaga);
	}
	public boolean existsByBlocoAndApartamento(String bloco, String apartamento) {
		return parkingSpotRepository.existsByBlocoAndApartamento(bloco, apartamento);
	}
	public List<ParkingSpotModel> findAll() {
		return parkingSpotRepository.findAll();
	}
	public Optional<ParkingSpotModel> findById(UUID id) {
		return parkingSpotRepository.findById(id);
	}

	
	@Transactional
	public void delete(ParkingSpotModel parkingSpotModel) {
		parkingSpotRepository.delete(parkingSpotModel);		
	}

}
