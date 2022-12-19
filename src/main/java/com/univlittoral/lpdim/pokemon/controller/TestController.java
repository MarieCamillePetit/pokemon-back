/**
 * 
 */
package com.univlittoral.lpdim.pokemon.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author antoineoffroy
 *
 */
@RestController
@RequestMapping
public class TestController {
	
	@GetMapping
	public String test() {
		return "Serveur back pokémon démarré";
	}
}
