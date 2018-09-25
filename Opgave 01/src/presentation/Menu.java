package presentation;

import java.util.Scanner;

import logic.VennerOgBekendte;

public class Menu {

	private VennerOgBekendte vennerOgBekendte;
	
	public void start(VennerOgBekendte vennerOgBekendte) {
		this.vennerOgBekendte = vennerOgBekendte;
		try(Scanner sc = new Scanner(System.in)) {
			showMenu();
			String menuvalg = sc.nextLine();
			while (!menuvalg.equals("x")) {
				processMenuValg(menuvalg, sc);
				showMenu();
				menuvalg = sc.nextLine();
			}
		}

		
	}
	
	private void showMenu() {
		System.out.println("Venner og Bekendte");
		System.out.println("Indtast valg, eller afslut med \"x\"");
		System.out.println("  1: Opret ven eller bekendt");
		System.out.println("  2: Opdater ven eller bekendt");
		System.out.println("  3: Slet ven eller bekendt");
		System.out.println("  4: Hent ven eller bekendt");
		System.out.println("  5: Find ven eller bekendt");
		System.out.println("  x: Afslut");
	}
	
	private void processMenuValg(String menuvalg, Scanner sc) {
		switch (menuvalg) {
		case "1":
			System.out.println("  1: Opret ven eller bekendt");
			OpretVen opretVen = new OpretVen();
			opretVen.start(vennerOgBekendte, sc);
			break;
		case "2":
			System.out.println("  2: Opdater ven eller bekendt");

			break;
		case "3":
			System.out.println("  3: Slet ven eller bekendt");

			break;
		case "4":
			System.out.println("  4: Hent ven eller bekendt");
			HentVen hentVen = new HentVen();
			hentVen.start(vennerOgBekendte, sc);
			break;
		case "5":
			System.out.println("  5: Find ven eller bekendt");
			FindVen findVen = new FindVen();
			findVen.start(vennerOgBekendte, sc);
			
			break;
		case "x":
			System.out.println("  x: Afslut");

			break;
		default:
			showMenu();
			break;
		}
	}

}