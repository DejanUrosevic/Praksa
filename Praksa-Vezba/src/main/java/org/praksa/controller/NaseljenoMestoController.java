package org.praksa.controller;

import java.util.List;

import org.praksa.dao.DrzavaDao;
import org.praksa.dao.NaseljenoMestoDao;
import org.praksa.model.Drzava;
import org.praksa.model.NaseljenoMesto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/naseljeno_mesto")
public class NaseljenoMestoController {
	
	@Autowired
	NaseljenoMestoDao nasMesDao;
	
	@Autowired
	DrzavaDao drzDao;
	
	@RequestMapping(value="/{naziv}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<NaseljenoMesto> newCity(@PathVariable String naziv) 
	{
		
		NaseljenoMesto nm = new NaseljenoMesto();
		nm.setNaziv(naziv);
		nm.setPtt("3232");
		List<Drzava> drzave = (List<Drzava>) drzDao.findAll();
		nm.setDrzava(drzave.get(0));
		
		nasMesDao.save(nm);
		
		return new ResponseEntity<NaseljenoMesto>(HttpStatus.OK);
	}
	
	
	@RequestMapping(value="",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<NaseljenoMesto>> getAllCities()
	{
		return new ResponseEntity<List<NaseljenoMesto>>((List<NaseljenoMesto>) nasMesDao.findAll(), HttpStatus.OK);
		
	}

}
