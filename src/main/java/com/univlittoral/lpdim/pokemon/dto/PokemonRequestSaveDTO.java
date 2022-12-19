package com.univlittoral.lpdim.pokemon.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.univlittoral.lpdim.pokemon.enums.TypeEnum;

public class PokemonRequestSaveDTO {
	
	private String categorie;
	
	private String description;
	
	@Enumerated(EnumType.STRING)
	private TypeEnum faiblesse;
	
	@Enumerated(EnumType.STRING)
	private TypeEnum force;
	
	private String nom;
	
	private Integer numero;
	
	private Integer poids;
	
	private Integer taille;
	
	private String talent;	
	
	@Enumerated(EnumType.STRING)
	private TypeEnum type;

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public TypeEnum getFaiblesse() {
		return faiblesse;
	}

	public void setFaiblesse(TypeEnum faiblesse) {
		this.faiblesse = faiblesse;
	}

	public TypeEnum getForce() {
		return force;
	}

	public void setForce(TypeEnum force) {
		this.force = force;
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

	public Integer getPoids() {
		return poids;
	}

	public void setPoids(Integer poids) {
		this.poids = poids;
	}

	public Integer getTaille() {
		return taille;
	}

	public void setTaille(Integer taille) {
		this.taille = taille;
	}

	public String getTalent() {
		return talent;
	}

	public void setTalent(String talent) {
		this.talent = talent;
	}

	public TypeEnum getType() {
		return type;
	}

	public void setType(TypeEnum type) {
		this.type = type;
	}
	
	
}
