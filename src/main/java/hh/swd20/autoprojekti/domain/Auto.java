package hh.swd20.autoprojekti.domain;


public class Auto {  // kaikki luokat periytyy Object-luokasta
	
	//attribuutit
	private String merkki;
	private int valmistusvuosi;
	
	// konstruktorit
	public Auto(String merkki, int valmistusvuosi) {
		super();
		this.merkki = merkki;
		this.valmistusvuosi = valmistusvuosi;
	}
	
	public Auto() {
		super();
		this.merkki = null;
		this.valmistusvuosi = 0;
	}

	public void setMerkki(String merkki) {
		this.merkki = merkki;
	}

	public void setValmistusvuosi(int valmistusvuosi) {
		this.valmistusvuosi = valmistusvuosi;
	}

	// setterit ja getterit
	public String getMerkki() {
		return merkki;
	}

	public int getValmistusvuosi() {
		return valmistusvuosi;
	}

	// toString
	@Override
	public String toString() {
		return "Auto [merkki=" + merkki + ", valmistusvuosi=" + valmistusvuosi + "]";
	}
		
	
	
	

}
