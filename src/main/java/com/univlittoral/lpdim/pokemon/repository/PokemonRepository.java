package com.univlittoral.lpdim.pokemon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.univlittoral.lpdim.pokemon.entity.PokemonEntity;
import com.univlittoral.lpdim.pokemon.enums.TypeEnum;

@Repository
public interface PokemonRepository extends JpaRepository<PokemonEntity, Integer>{
	
	@Query(value="SELECT p FROM PokemonEntity where p.type = :type")
	List<PokemonEntity> findPokemonByType(@Param("type") final TypeEnum type);
	
}
