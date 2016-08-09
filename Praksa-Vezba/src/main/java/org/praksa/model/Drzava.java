package org.praksa.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DRZAVA")
public class Drzava implements Serializable
{
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int sifra;
	
	@Column(name = "naziv")
	private String naziv;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "drzava")
	private List<NaseljenoMesto> naseljenaMesta = new ArrayList<NaseljenoMesto>();
	


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
