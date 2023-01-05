package com.api.parkingcontrol.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_VAGA")
public class ParkingSpotModel implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	@Column(nullable = false, unique = true, length =10)
	private String numeroDaVaga;
	@Column(nullable = false, unique = true, length =7)
	private String placaVeiculo;
	@Column(nullable = false, length = 70)
	private String marcaVeiculo;
	@Column(nullable = false, length = 70)
	private String modeloVeiculo;
	@Column(nullable = false, length = 70)
	private String corVeiculo;
	@Column(nullable = false)
	private LocalDateTime dataRegistro;
	@Column(nullable = false, length = 130)
	private String nomeReponsavel;
	@Column(nullable = false, length = 30)
	private String apartamento;
	@Column(nullable = false, length = 30)
	private String bloco;
	
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getNumeroDaVaga() {
		return numeroDaVaga;
	}
	public void setNumeroDaVaga(String numeroDaVaga) {
		this.numeroDaVaga = numeroDaVaga;
	}
	public String getPlacaVeiculo() {
		return placaVeiculo;
	}
	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}
	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}
	public void setMarcaVeiculo(String marcaVeiculo) {
		this.marcaVeiculo = marcaVeiculo;
	}
	public String getModeloVeiculo() {
		return modeloVeiculo;
	}
	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}
	public String getCorVeiculo() {
		return corVeiculo;
	}
	public void setCorVeiculo(String corVeiculo) {
		this.corVeiculo = corVeiculo;
	}
	public LocalDateTime getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(LocalDateTime dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	public String getNomeReponsavel() {
		return nomeReponsavel;
	}
	public void setNomeReponsavel(String nomeReponsavel) {
		this.nomeReponsavel = nomeReponsavel;
	}
	public String getApartamento() {
		return apartamento;
	}
	public void setApartamento(String apartamento) {
		this.apartamento = apartamento;
	}
	public String getBloco() {
		return bloco;
	}
	public void setBloco(String bloco) {
		this.bloco = bloco;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
