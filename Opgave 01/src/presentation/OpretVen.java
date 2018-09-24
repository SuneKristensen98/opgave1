package presentation;

import java.util.Scanner;

import logic.Ven;
import logic.VennerOgBekendte;

public class OpretVen {
	private VennerOgBekendte venner;

	public void start(VennerOgBekendte venner, Scanner sc) {
		this.venner = venner;
		showMenu();
		String indtastning = sc.nextLine();
		while (!indtastning.equals("x")) {
			processIndtasning(indtastning, sc);
			showMenu();
			indtastning = sc.nextLine();
		}

	}

	private void showMenu() {
		System.out.println("Opret Ven eller Bekendt");
		System.out.println("Indtast navn, email, telefon, fødselsdag, adresse, postnr efterfulgt med et , efter hver indtastning - For at afslutte tryk på \"x\"");
	}

	private void processIndtasning(String indtastning, Scanner sc) {
		String[] dele = indtastning.split(",");
		Ven ven = new Ven(dele[0].trim(), dele[1].trim(), dele[2].trim(), dele[3].trim(), dele[4].trim(), dele[5].trim());
		boolean retur = venner.opret(ven);
		if(retur = true);
		System.out.println();
		System.out.println("Succesfuldt Oprettet");
		System.out.println();
		
		if (retur = false)
		System.out.println("Fejl i opretning");
		
		
		
	}

}