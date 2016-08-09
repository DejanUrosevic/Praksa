package org.praksa.model;

public class Drzava 
{
	private int sifra;
	private String naziv;
	
	public Drzava()
	{
		
	}
	

	public Drzava(int sifra, String naziv) {
		super();
		this.sifra = sifra;
		this.naziv = naziv;
	}



	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	
}
