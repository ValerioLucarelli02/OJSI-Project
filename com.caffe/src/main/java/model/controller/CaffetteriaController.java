package model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Caffetteria;
import model.service.CaffetteriaService;

@RestController
@RequestMapping ("caffetteria")
public class CaffetteriaController {
	@Autowired
	private CaffetteriaService service;
	
	@PostMapping
	public boolean insCaffetteria(@RequestBody Caffetteria objCaff) {
		return service.inserisci(objCaff);

}
	@GetMapping
	public List<Caffetteria> allCaffetteria(){
		return service.listaCaffetteria();
	}
	
}
