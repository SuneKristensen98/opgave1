package presentation;

import java.util.Scanner;

import logic.Ven;
import logic.VennerOgBekendte;
import logic.VennerOgBekendteImpl;

public class HentVen {
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

	private void processIndtasning(String email, Scanner sc) {
		Ven ven = venner.hent(email.trim());
		boolean retur = false;
		
		if (retur) {
			System.out.println();
			System.out.println("Succesfuldt hentet");
			System.out.println();
		}
		

		
	
	}
}
