package com.univlittoral.lpdim.pokemon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univlittoral.lpdim.pokemon.entity.PokemonEntity;
import com.univlittoral.lpdim.pokemon.enums.TypeEnum;
import com.univlittoral.lpdim.pokemon.repository.PokemonRepository;

@Service
public class PokemonService {
	
	@Autowired
	private PokemonRepository repo; 
	
	//Utilisation du service "findAll" pour obtenir les pokémons
	public List<PokemonEntity> findAll(){
		return repo.findAll();
	}
	//Utilisation du service "findById" pour obtenir un pokémon en fonction de son id
	public PokemonEntity findById(Integer id) {
		return repo.findById(id).orElse(null);
	}
	
	//Utilisation du service "deleteById" pour supprimer un pokémon en fonction de son id
	public void deleteById(int id) {
		repo.deleteById(id);
	}
	
	//Utilisation du service "save" pour ajouter un pokémon et pour le modifier
	public void addOrUpdatePokemon(PokemonEntity newPokemon) {
		repo.save(newPokemon);
	}
	
	public List<PokemonEntity> findByType(TypeEnum type){
		return repo.findPokemonByType(type);
	}
	
	
	
}
