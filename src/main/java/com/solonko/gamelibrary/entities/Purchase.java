package com.solonko.gamelibrary.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Purchase extends Game {

	@Id
	@GeneratedValue
	private Long id;

	private String storefront;
	public String getStorefront() {
		return storefront;
	}
	public void setStorefront(String storefront) {
		this.storefront = storefront;
	}

	private Date purchaseDate;
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	private double price;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	private boolean sale;
	public boolean getSale() {
		return sale;
	}
	public void setSale(boolean inputSale) {
		this.sale = inputSale;
	}
	
}