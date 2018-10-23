package data;
import java.util.Arrays;


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
		System.out.println();
		System.out.println(ven);
	}

	public Ven getElement(int index) {
		return array[index];
	}

	public int size() {
		return nextElement;
	}

	public void removeElement(int i) {
//		array.remove(i);
		
	}
	
	public void replaceElement(int i, Ven element) {
	//	array.set(i, Ven element);
	}
	
	

	public Ven find(String sogestreng) {
		for (int i = 0; i < nextElement; i++) {
			
			if (array[i].getEmail().contains(s)) {
				System.out.println(array[i]);
				System.out.println();
				return array[i];
		return null;
	}
		}
	}

	public Ven hent(String email) {
		for (int i = 0; i < nextElement; i++) {
			if (array[i].getEmail().equals(email)) {
				System.out.println(array[i]);
				System.out.println();
				return array[i];
				
			}
		}

		System.out.println();
		System.out.println("Denne email findes ikke");
		System.out.println();
		return null;
		}
	
		


		@Override
		public String toString() {
			String s = "";
			
			for(int i = 0; i<size(); i++) {
				Ven ven = getElement(i);
				s = s + ven.toString() + "\n";
			}
			
			return s;
		}
	}
