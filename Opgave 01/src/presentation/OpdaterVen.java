package presentation;

import java.util.Scanner;

import logic.Ven;
import logic.VennerOgBekendte;

public class OpdaterVen {
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
		System.out.println("Hent Ven eller Bekendt");
		System.out.println("Indtast email - For at afslutte tryk på \"x\"");
	}

	private void processIndtasning(String navn, Scanner sc) {

		String email = sc.nextLine();
		Ven ven = venner.hent(email);
		System.out.println("Indtast resten");
		String indtastning = sc.nextLine();
		String[] resten = indtastning.split(",");
		Ven opdateretVen = new Ven(resten[0], email, resten[1]);
		venner.opdater(opdateretVen);

		 boolean retur = venner.hent(email);
		 if(retur = true);

		System.out.println();
		System.out.println("Succesfuldt opdateret");
		System.out.println();

		// if (retur = false)
		System.out.println("Fejl i opdatering");

	}

}