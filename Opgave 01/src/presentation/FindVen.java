package presentation;


import java.util.Scanner;

import data.VenContainer;
import logic.Ven;
import logic.VennerOgBekendte;

public class FindVen {

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
		System.out.println();
		System.out.println("Find Ven eller Bekendt");
		System.out.println("Indtast søgeord - For at afslutte tryk på \"x\"");
	}

	private void processIndtasning(String sogestreng, Scanner sc) {
		VenContainer ven = venner.find(sogestreng.trim());
		boolean retur = false;
		

		
		if (retur == true) {
			System.out.println();
			System.out.println("Succesfuldt fundet");
			System.out.println();
		}
		

		
	
	}
}


