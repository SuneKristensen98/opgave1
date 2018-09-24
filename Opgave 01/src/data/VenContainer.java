package data;

import logic.Ven;

public class VenContainer {

	int a, b;
	String t;

	private Ven[] array;
	private int nextElement = 0;

	public VenContainer() {
		array = new Ven[6];
	}

	public VenContainer(int startantal) {
		array = new Ven[startantal];
	}

	public void addElement(Ven ven) {
		if (nextElement >= array.length) {
			Ven[] temp = array;
			array = new Ven[array.length * 2];
			for (int i = 0; i < nextElement; i++) {
				array[i] = temp[i];

			}
		}
		array[nextElement] = ven;
		nextElement++;
		System.out.println("jeg har været i addElement" + ven);
	}

	public Ven getElement(int index) {
		return array[index];
	}

	public int size() {
		return nextElement;
	}

	public Ven find(String email) {
		return null;
	}

	public Ven hent(String email) {
		for (int i = 0; i < nextElement; i++) {
			if (array[i].getEmail().equals(email)) {
				System.out.println(array[i]);
				return array[i];
				
			}
		}

		System.out.println();
		System.out.println("Denne email findes ikke");
		System.out.println();
		return null;
		}
	}


//		for (int a = 1; a < nextElement; a++) {
//			for (int b = nextElement - 1; b >= a; b--) {
//				if (array[b - 1].compareTo(array[b]) > 0) { 
//					// if out of order, exchange elements
//					String t = array[b - 1];
//					array[b - 1] = array[b];
//					array[b] = t;
//				}
//			}
//		}
//	}
//
//}