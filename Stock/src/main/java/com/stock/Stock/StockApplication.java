package com.stock.Stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class StockApplication {

	public static void main(String[] args) {
		//SpringApplication.run(StockApplication.class, args);

		Map<String, Integer> Nourriture = new HashMap();
		Prducts prducts = new Prducts(2, 2, 2, 7,
				6, 6);

		Nourriture.put("danon" , prducts.getSock_danon_client());
		Nourriture.put("farin" , prducts.getSock_farin_client());
		Nourriture.put("Thé" , prducts.getSock_The_client());

		int danonstock = Nourriture.get("danon") - prducts.getValue_danon_client();
		int farinstock = Nourriture.get("farin") - prducts.getValue_farin_client();
		int Thestock = Nourriture.get("Thé") - prducts.getValue_The_client();

		Serializable valueclientdanon = danonstock > 0 ?  "Le client a demandé danon de " + prducts.getValue_danon_client() : "Le client a demandé plus que ce qui est disponible dans Stock danon";
		Serializable valueclientfarins = farinstock > 0 ?  "Le client a demandé farins de " + prducts.getValue_farin_client()  : "Le client a demandé plus que ce qui est disponible dans Stock farins";
		Serializable valueclientThe = Thestock > 0 ?  "Le client a demandé The de " + prducts.getValue_The_client()  : "Le client a demandé plus que ce qui est disponible dans Stock The";

		System.out.println( valueclientdanon);
		System.out.println( valueclientfarins);
		System.out.println( valueclientThe);
		System.out.println();
		System.out.println("Stock danon :" + danonstock);
		System.out.println("Stock farin :" + farinstock);
		System.out.println("Stock Thé :" + Thestock);

	}

}
