package com.univlittoral.lpdim.pokemon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.univlittoral.lpdim.pokemon.enums.TypeEnum;

@Entity // => Pour que votre application Spring boot sache que cette classe est une entité
@Table(name="pokemon") //=> le nom de la table de votre base de données associée à cet objet Entité.
public class PokemonEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="numero")
	private Integer numero;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="description")
	private String description;
	
	@Column(name="taille")
	private Integer taille;
	
	@Column(name="poids")
	private Integer poids;
	
	@Column(name="categorie")
	private String categorie;
	
	@Column(name="talent")
	private String talent;
	
	@Column(name="type")
	@Enumerated(EnumType.STRING)
	private TypeEnum type;
	
	@Column(name="strenght")
	@Enumerated(EnumType.STRING)
	private TypeEnum strenght;
	
	@Column(name="faiblesse")	
	@Enumerated(EnumType.STRING)
	private TypeEnum faiblesse;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getTaille() {
		return taille;
	}

	public void setTaille(Integer taille) {
		this.taille = taille;
	}

	public Integer getPoids() {
		return poids;
	}

	public void setPoids(Integer poids) {
		this.poids = poids;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
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

	public TypeEnum getStrenght() {
		return strenght;
	}

	public void setStrenght(TypeEnum strenght) {
		this.strenght = strenght;
	}

	public TypeEnum getFaiblesse() {
		return faiblesse;
	}

	public void setFaiblesse(TypeEnum faiblesse) {
		this.faiblesse = faiblesse;
	}


	
}

