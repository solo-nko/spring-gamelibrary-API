package com.solonko.gamelibrary.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.solonko.gamelibrary.entities.Purchase;

public interface PurchaseRepository extends CrudRepository<Purchase, Long> {
	
	int countByStorefront(String inputStorefront);
	int countBySale(boolean inputSale);

	List<Purchase> getByStorefront(String inputStorefront);
	
}
