package org.lessons.java.shop;

public class Utility {

	// METODO CHE RESTITUISCE IL PREZZO COMPRENSIVO D'IVA
	public static void getPriceIva(Double iva, double price) {
		iva = (price/100) * iva;
		System.out.printf("- IVA CALCOLATA ---> %.3f€ \n", iva);
		System.out.printf("- PREZZO CON IVA ---> %.3f€ \n", (price + iva)); 
	}
	
	// METODO CHE RESTITUISCE IL NOME-CODICE
	public static void getNameCode(int code, String name) {
		System.out.println(code + "-" + name);
	}
	
	
}
