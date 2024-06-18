package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		
		/*
		   - OGGETTO PRODOTTO;
		   - METODO CHE RESTITUISCE IL PREZZO BASE;
		   - METODO CHE CALCOLA IL PREZZO CON PARTITA IVA;
		   - METODO CHE RESTITUISCE IL NOME ESTESO;
		 */
		Prodotto phone = new Prodotto("Samsung", "Cellulare", 200.99, 10);
		System.out.printf("- PREZZO BASE ---> %.3f€ \n", phone.getPrice());
		Utility.getPriceIva(phone.getIva(), phone.getPrice());
		Utility.getNameCode(phone.getCode(), phone.getName());

		
		//BONUS
		
	}

}
