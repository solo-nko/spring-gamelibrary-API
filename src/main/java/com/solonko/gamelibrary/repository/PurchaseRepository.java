package com.solonko.gamelibrary.repository;

import com.solonko.gamelibrary.model.Purchase;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PurchaseRepository extends CrudRepository<Purchase, Long> {
	
	int countByStorefront(String inputStorefront);
	int countBySale(boolean inputSale);

	List<Purchase> getByStorefront(String inputStorefront);
	
}
