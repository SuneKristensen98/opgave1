package logic;

import data.VenContainer;

public class VennerOgBekendteImpl implements VennerOgBekendte {

	private VenContainer venner = new VenContainer();
	@Override
	public boolean opret(Ven ven) {
		Ven gammelven = hent(ven.getEmail());
		if (gammelven != null) {
			return false;
		} else {
			venner.addElement(ven);
			return true;
		}
	}

	@Override
	public boolean opdater(Ven ven) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean slet(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Ven hent(String email) {
		return venner.hent(email);
		
	}

	@Override
	public VenContainer find(String sogestreng) {
		
		return null;
	}

}