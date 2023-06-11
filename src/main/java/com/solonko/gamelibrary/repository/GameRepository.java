package com.solonko.gamelibrary.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.solonko.gamelibrary.model.Game;

public interface GameRepository extends CrudRepository<Game, Long>{

	int countByDeveloper(String inputDeveloper);
	
	List<Game> getByDeveloper(String inputDeveloper);
	
}
