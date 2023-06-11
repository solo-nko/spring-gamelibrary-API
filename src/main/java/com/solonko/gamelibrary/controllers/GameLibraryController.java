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

	@PostMapping("/purchases")
	public Purchase addPurchase(@RequestBody Purchase inputPurchase) {
		Purchase addedPurchase = this.purchaseRepository.save(inputPurchase);
		return addedPurchase;
	}
}
