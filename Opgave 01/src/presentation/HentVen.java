package presentation;

import java.util.Scanner;

import logic.Ven;
import logic.VennerOgBekendte;

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

	private void processIndtasning(String indtastning, Scanner sc) {
		String[] dele = indtastning.split(",");
		Ven ven = venner.hent(indtastning.trim());

		//if (retur = true)
			
		System.out.println();
		System.out.println("Succesfuldt hentet");
		System.out.println();

	//	if (retur = false)
			System.out.println("Fejl i forbindelse med at hente ven");

	}

}
