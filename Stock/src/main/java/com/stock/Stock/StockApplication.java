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

		//int client;
		Map<String, Integer> Nourriture_client_x = new HashMap();
		Nourriture_client_x.put("moufid", 3);
		Nourriture_client_x.put("kafila", 1);
		Nourriture_client_x.put("mimona", 1);

		Prducts prducts_danoun = new Prducts("moufid", "danoun", 10, 1);
		Prducts prducts_the = new Prducts("kafila", "the", 10, 5);
		Prducts prducts_farin = new Prducts("mimona", "farin", 10, 100);

		int danonstock = prducts_danoun.getStock() - Nourriture_client_x.get("moufid") ;
		int thestock = prducts_the.getStock() - Nourriture_client_x.get("kafila");
		int farinstock = prducts_farin.getStock() - Nourriture_client_x.get("mimona");

		Serializable valueclientdanon = danonstock > 0 ?  "": "Le client a demandé plus que ce qui est disponible dans Stock danon";
		Serializable valueclientthe = thestock > 0 ?    "" : "Le client a demandé plus que ce qui est disponible dans Stock danon";
		Serializable valueclientfarin = farinstock > 0 ?  "" : "Le client a demandé plus que ce qui est disponible dans Stock danon";

		// cote stock
		System.out.println(valueclientdanon);
		System.out.println(valueclientthe);
		System.out.println(valueclientfarin);

		System.out.println("Cote stock :");
		System.out.println("Reste dans Stock moufid :" + danonstock);
		System.out.println("Reste dans Stock  kafila :" + thestock);
		System.out.println("Reste dans Stock  mimona :" + farinstock);
		System.out.println();
		//cote client
		System.out.println("Cote client :");
		System.out.println("client danon :" + Nourriture_client_x.get("moufid") * prducts_danoun.getPrix());
		System.out.println("client kafila :" + Nourriture_client_x.get("kafila") * prducts_the.getPrix());
		System.out.println("client mimona :" + Nourriture_client_x.get("mimona") * prducts_farin.getPrix());
		double total = Nourriture_client_x.get("moufid") * prducts_danoun.getPrix() +
				Nourriture_client_x.get("kafila") * prducts_the.getPrix() +
				Nourriture_client_x.get("mimona") * prducts_farin.getPrix();
		System.out.println("Total :" + total);

	}

}
