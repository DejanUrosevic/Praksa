package org.praksa.controller;

import java.util.ArrayList;
import java.util.List;

import org.praksa.model.Drzava;
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
	@RequestMapping(value="/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Drzava> getState(@PathVariable int id) 
	{
		List<Drzava> lista = new ArrayList<Drzava>();
		lista.add(new Drzava(1, "Mauricijus"));
		lista.add(new Drzava(2, "Egipat"));
		
		for(Drzava d : lista)
		{
			if(d.getSifra() == id)
			{
				return new ResponseEntity<Drzava>(d, HttpStatus.OK);
			}
		}
		
		return new ResponseEntity<Drzava>(HttpStatus.NOT_FOUND);
		
		

	}

}