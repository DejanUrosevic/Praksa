package org.praksa.controller;

import java.util.ArrayList;
import java.util.List;

import org.praksa.dao.DrzavaDao;
import org.praksa.model.Drzava;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/drzava")
public class DrzavaController 	
{
	
	@Autowired
	DrzavaDao drzavaDao;
	
	@RequestMapping(value="/{naziv}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Drzava> getState(@PathVariable String naziv) 
	{
		Drzava d = new Drzava();
		d.setNaziv(naziv);
		drzavaDao.save(d);
		
		return new ResponseEntity<Drzava>(HttpStatus.OK);
	}
	
	@RequestMapping(value="", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Drzava>> getAllStates() 
	{
		
		return new ResponseEntity<List<Drzava>>((List<Drzava>) drzavaDao.findAll(), HttpStatus.OK);
	}

	
}
