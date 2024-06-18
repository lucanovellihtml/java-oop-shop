package org.lessons.java.shop;

public class Prodotto {

	//VARIABILI
	private int code;
	private String name, description;
	double price, iva;
	
	
	//COSTRUTTORE
	public Prodotto(String name, String description, double price, double iva) {
		this.code = (int) (Math.random() * 1000);
		this.name = name;
		this.description = description;
		this.price = price;
		this.iva = iva;
	}

	
	//METODI GETTER/SETTER
	public int getCode() {
		return code;
	}

	//NON ACCESSIBILE
	private void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	//METODO PER OTTENERE PREZZO BASE
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}
		
}
