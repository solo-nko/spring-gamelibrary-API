package com.solonko.gamelibrary.model;

import java.util.Date;

public class Purchase extends Game {

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