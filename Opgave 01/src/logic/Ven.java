package logic;

public class Ven {

	protected String navn;
	protected String email;
	protected String telefon;
	protected String fødselsdag;
	protected String adresse;
	protected String postnr;
	
	public Ven(String navn, String email, String telefon, String fødselsdag, String adresse, String postnr) {
		this.navn = navn;
		this.email = email;
		this.telefon = telefon;
		this.fødselsdag = fødselsdag;
		this.adresse = adresse;
		this.postnr = postnr;

	}

	public String getNavn() {
		return navn;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefon() {
		return telefon;
	}

	public String getFødselsdag() {
		return fødselsdag;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public String getPostnr() {
		return postnr;
	}

	@Override
	public String toString() {
		return "Ven [navn=" + navn + ", email=" + email + ", telefon=" + telefon + ", fødselsdag=" + fødselsdag
				+ ", adresse=" + adresse + ", postnr=" + postnr + "]";
	}
	
	
	
	
}