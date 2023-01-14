package com.api.parkingcontrol.dtos;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ParkingSpotDto {
	@NotBlank
	private String numeroDaVaga;
	@NotBlank
	@Size(max = 7)
	private String placaVeiculo;
	@NotBlank
	private String marcaVeiculo;
	@NotBlank
	private String modeloVeiculo;
	@NotBlank
	private String corVeiculo;
	@NotBlank
	private String nomeResponsavel;
	@NotBlank
	private String apartamento;
	@NotBlank
	private String bloco;
	
	//Methods Getters and Setters
	
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
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}
	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
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


	
	
}
