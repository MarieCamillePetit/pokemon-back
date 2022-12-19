package com.univlittoral.lpdim.pokemon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.univlittoral.lpdim.pokemon.dto.PokemonDTO;
import com.univlittoral.lpdim.pokemon.dto.PokemonRequestSaveDTO;
import com.univlittoral.lpdim.pokemon.enums.TypeEnum;
import com.univlittoral.lpdim.pokemon.mapper.PokemonMapper;
import com.univlittoral.lpdim.pokemon.service.PokemonService;

import io.swagger.v3.oas.annotations.Operation;



@RestController //-> est utilisé pour marquer les classes en tant que contrôleur Spring.
@RequestMapping(value = "/rest/bd/pokemons") //=> l’URL d’accès à votre controller.
public class PokemonController {

	@Autowired
	private PokemonService service;
	
	//Obtenir les pokémons
	@GetMapping
	@Operation(summary ="Trouver tout les pokémons")
	public List<PokemonDTO> findAll(){
		return PokemonMapper.map(service.findAll());
	}
	
	//Trouver un pokémon selon son id dans le but d'afficher ses détails
	@GetMapping(value="{id}")
	@Operation(summary ="Trouver un pokémon avec son id")
	public PokemonDTO findById(@PathVariable Integer id) {
		return PokemonMapper.map(service.findById(id));
	}
	
	//Supprimer un pokémon
	@DeleteMapping(value="{id}")
	@Operation(summary ="Suppresion d'un pokémon")
	public void deletePokemon(@PathVariable int id) {
		service.deleteById(id);
	}
	
	//Ajout de pokémon
	@PostMapping
	@Operation(summary ="Ajout d'un pokémon")
	public void AddPokemon(@RequestBody PokemonRequestSaveDTO newPokemon){
		service.addOrUpdatePokemon(PokemonMapper.newPokemonMapper(newPokemon));
	}
	
	//Modification de pokémon
	@PutMapping("/{id}")
	@Operation(summary ="Modification d'un pokémon")
    public void modif(@PathVariable Integer id, @RequestBody PokemonRequestSaveDTO pokemon) {
        service.addOrUpdatePokemon(PokemonMapper.modifPokemonMapper(service.findById(id), pokemon));
    }
	
	@GetMapping(value="test")
	public List<PokemonDTO> findByType(@RequestParam TypeEnum type){
		return PokemonMapper.map(service.findByType(type));
	}
}