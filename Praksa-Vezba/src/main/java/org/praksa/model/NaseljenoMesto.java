package org.praksa.model;

import javax.persistence.*;

@Entity
@Table(name="NASELJENO_MESTO")
public class NaseljenoMesto {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "naziv")
	private String naziv;
	
	@Column(name = "ptt")
	private String ptt;
	
	@ManyToOne
	@JoinColumn(name = "drzava_id", referencedColumnName = "id", nullable = false)
	private Drzava drzava;
	
	public NaseljenoMesto()
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getPtt() {
		return ptt;
	}

	public void setPtt(String ptt) {
		this.ptt = ptt;
	}

	public Drzava getDrzava() {
		return drzava;
	}

	public void setDrzava(Drzava drzava) {
		this.drzava = drzava;
	}

	public NaseljenoMesto(int id, String naziv, String ptt, Drzava drzava) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.ptt = ptt;
		this.drzava = drzava;
	}
	
	
	
}
