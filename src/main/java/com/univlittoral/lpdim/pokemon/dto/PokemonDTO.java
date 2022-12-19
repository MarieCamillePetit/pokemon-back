package com.univlittoral.lpdim.pokemon.dto;


import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.univlittoral.lpdim.pokemon.enums.TypeEnum;

public class PokemonDTO {
	
	private CaracteristiquesDTO caracteristiques;
	
	private String description;
	private Integer id;
	private String nom;
	private Integer numero;
	
	@Enumerated(EnumType.STRING)
	private TypeEnum type;

	public CaracteristiquesDTO getCaracteristiques() {
		return caracteristiques;
	}

	public void setCaracteristiques(CaracteristiquesDTO caracteristiques) {
		this.caracteristiques = caracteristiques;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public TypeEnum getType() {
		return type;
	}

	public void setType(TypeEnum type) {
		this.type = type;
	}
	
	
	
}
