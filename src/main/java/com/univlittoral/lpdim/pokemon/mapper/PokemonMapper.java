package com.univlittoral.lpdim.pokemon.mapper;

import java.util.ArrayList;
import java.util.List;

import com.univlittoral.lpdim.pokemon.dto.CaracteristiquesDTO;
import com.univlittoral.lpdim.pokemon.dto.PokemonDTO;
import com.univlittoral.lpdim.pokemon.dto.PokemonRequestSaveDTO;
import com.univlittoral.lpdim.pokemon.entity.PokemonEntity;


public class PokemonMapper {

	//Permet de récupérer les Pokémons
	public static PokemonDTO map(PokemonEntity entity) {
		CaracteristiquesDTO caracteristik = new CaracteristiquesDTO();
		PokemonDTO pokemon = new PokemonDTO();
 
	
		caracteristik.setCategorie(entity.getCategorie());
		caracteristik.setFaiblesse(entity.getFaiblesse());
		caracteristik.setForce(entity.getStrenght());
		caracteristik.setPoids(entity.getPoids());
		caracteristik.setTaille(entity.getTaille());
		caracteristik.setTalent(entity.getTalent());
		
				
		pokemon.setId(entity.getId());
		pokemon.setNumero(entity.getNumero());
		pokemon.setType(entity.getType());
		pokemon.setNom(entity.getNom());
		pokemon.setDescription(entity.getDescription());
		
		pokemon.setCaracteristiques(caracteristik);
		
		return pokemon;
	}
	
	//Permet de récupérer les Pokémon
	public static List<PokemonDTO> map(List<PokemonEntity> PokemonEntity){
		if(null == PokemonEntity) {
			return null;
		}
		List<PokemonDTO> result = new ArrayList<PokemonDTO>();
		for(final PokemonEntity pokemon : PokemonEntity) {
			result.add(PokemonMapper.map(pokemon));
		}
		
		return result;
	}
	
	//Ajout d'un Pokémon
	public static PokemonEntity newPokemonMapper(PokemonRequestSaveDTO pokemonNew) {
        PokemonEntity newPokemon = new PokemonEntity();
                
        newPokemon.setCategorie(pokemonNew.getCategorie());
        newPokemon.setFaiblesse(pokemonNew.getFaiblesse());
        newPokemon.setStrenght(pokemonNew.getForce());
        newPokemon.setPoids(pokemonNew.getPoids());
        newPokemon.setTaille(pokemonNew.getTaille());
        newPokemon.setTalent(pokemonNew.getTalent());

        newPokemon.setNumero(pokemonNew.getNumero());
        newPokemon.setType(pokemonNew.getType());
        newPokemon.setNom(pokemonNew.getNom());
        newPokemon.setDescription(pokemonNew.getDescription());        

        return newPokemon;
    }
	
	//Modification d'un Pokémon
	public static PokemonEntity modifPokemonMapper( PokemonEntity modifPokemon ,PokemonRequestSaveDTO pokemonModif) {
		
        modifPokemon.setCategorie(pokemonModif.getCategorie());
        modifPokemon.setFaiblesse(pokemonModif.getFaiblesse());
        modifPokemon.setStrenght(pokemonModif.getForce());
        modifPokemon.setPoids(pokemonModif.getPoids());
        modifPokemon.setTaille(pokemonModif.getTaille());
        modifPokemon.setTalent(pokemonModif.getTalent());

        modifPokemon.setNumero(pokemonModif.getNumero());
        modifPokemon.setType(pokemonModif.getType());
        modifPokemon.setNom(pokemonModif.getNom());
        modifPokemon.setDescription(pokemonModif.getDescription());        

        return modifPokemon;
    }

}
