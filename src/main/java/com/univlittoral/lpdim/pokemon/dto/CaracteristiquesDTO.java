package com.univlittoral.lpdim.pokemon.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.univlittoral.lpdim.pokemon.enums.TypeEnum;

public class CaracteristiquesDTO {

	private String categorie;
	
	@Enumerated(EnumType.STRING)
	private TypeEnum faiblesse;
	
	@Enumerated(EnumType.STRING)
	private TypeEnum force;
	
	private Integer poids;
	private Integer taille;
	private String talent;
	
	
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
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
	

	
}
