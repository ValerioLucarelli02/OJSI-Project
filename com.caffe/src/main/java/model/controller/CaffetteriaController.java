package model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Caffetteria;
import model.dto.CaffetteriaDto;
import model.service.CaffetteriaService;

@RestController
@RequestMapping("caffe")
@CrossOrigin("*")

public class CaffetteriaController {
	@Autowired
	private CaffetteriaService service;

	@PostMapping
	public boolean insCaffetteria (@RequestBody CaffetteriaDto objCaff) {
		
		return service.inserisciCaff(objCaff);
		
	}

	@GetMapping
	public List<CaffetteriaDto> allCaffetteria(){
		return service.findall();
	}
	@GetMapping("/{varCodice}")
	public CaffetteriaDto cercaCaff(@PathVariable String varCodice) {
		
		if(varCodice == null || varCodice == "")
			return null;
		
		return service.findByCodice(varCodice);
		
	}
	
	@DeleteMapping("/{varCodice}")
	public boolean eliminaCaff(@PathVariable String varCodice) {
		if(varCodice == null || varCodice == "") {
			return false;
		}
		
		return service.eliminaCaffetteria(varCodice);
	}
	
	@PutMapping("/{varCodice}")
	public boolean modificaCaff(@PathVariable String varCodice, @RequestBody CaffetteriaDto objCaff) {
		
		if(varCodice == null || varCodice == "")
			return false;
		
		return service.aggiornaCaff(varCodice, objCaff) != null;
		
	}
	
	
}


