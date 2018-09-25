package logic;

import java.lang.reflect.Array;

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
		for (int i = 0; i < venner.size(); i++) {
			Ven ven = venner.getElement(i);
			if (ven.getEmail().equals(email))
			 return venner.hent(email);
		}
		return null;
	}

	@Override
	public VenContainer find(String sogestreng) {

		VenContainer fundneVenner = new VenContainer();
		for (int i = 0; i < venner.size(); i++) {
			Ven ven = venner.getElement(i);
			if (ven.getNavn().toUpperCase().contains(sogestreng.toUpperCase()) 
					|| ven.getEmail().toLowerCase().contains(sogestreng.toLowerCase())
					|| ven.getTelefon().toLowerCase().contains(sogestreng.toLowerCase()) 
					|| ven.getAdresse().toUpperCase().contains(sogestreng.toUpperCase())
					|| ven.getPostnr().toLowerCase().contains(sogestreng.toLowerCase()) 
					|| ven.getFødselsdag().toLowerCase().contains(sogestreng.toLowerCase())) {
				fundneVenner.addElement(ven);
			}

		}
		return fundneVenner;

	}

}
