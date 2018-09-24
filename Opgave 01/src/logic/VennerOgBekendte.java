package logic;

import data.VenContainer;

public interface VennerOgBekendte {

	public boolean opret(Ven ven);
	
	public boolean opdater(Ven ven);
	
	public boolean slet(String email);
	
	public Ven hent(String email);
	
	public VenContainer find(String sogestreng);
	
	
}