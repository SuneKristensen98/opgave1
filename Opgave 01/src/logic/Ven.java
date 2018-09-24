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


	public void setNavn(String navn) {
		this.navn = navn;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefon() {
		return telefon;
	}


	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}


	public String getFødselsdag() {
		return fødselsdag;
	}


	public void setFødselsdag(String fødselsdag) {
		this.fødselsdag = fødselsdag;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public String getPostnr() {
		return postnr;
	}



	public void setPostnr(String postnr) {
		this.postnr = postnr;
	}



	@Override
	public String toString() {
		return "Ven [navn=" + navn + ", email=" + email + ", telefon=" + telefon + ", fødselsdag=" + fødselsdag
				+ ", adresse=" + adresse + ", postnr=" + postnr + "]";
	}
	
	
	
	
}