package com.solonko.gamelibrary.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solonko.gamelibrary.entities.Game;
import com.solonko.gamelibrary.entities.Purchase;
import com.solonko.gamelibrary.repositories.GameRepository;
import com.solonko.gamelibrary.repositories.PurchaseRepository;

/* STATUS
 * The API responds to GET and POST requests, and properly generates Ids, at least for the Game objects. Currently it seems to be using an in-memory database though, meaning that all data is lost when the server is shut down. Need to figure out how to make it permanently stored, or non-volatile.
 */
@RestController
@CrossOrigin
@RequestMapping
public class GameLibraryController {
	private final GameRepository gameRepository;
	private final PurchaseRepository purchaseRepository;

	public GameLibraryController(GameRepository inputGameRepo, PurchaseRepository inputPurchaseRepo) {
		this.gameRepository = inputGameRepo;
		this.purchaseRepository = inputPurchaseRepo;
	}

	@GetMapping("/purchases")
	public Iterable<Purchase> getPurchases() {
		return this.purchaseRepository.findAll();
	}

	@GetMapping("/games")
	public Iterable<Game> getGames() {
		return this.gameRepository.findAll();
	}

	@PostMapping("/games")
	public Game addGame(@RequestBody Game inputGame) {
		Game addedGame = this.gameRepository.save(inputGame);
		return addedGame;		
	}

	@PostMapping("/purchases")
	public Purchase addPurchase(@RequestBody Purchase inputPurchase) {
		Purchase addedPurchase = this.purchaseRepository.save(inputPurchase);
		return addedPurchase;
	}
}
