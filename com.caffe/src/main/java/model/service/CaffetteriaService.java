package model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Caffetteria;
import model.repository.CaffetteriaRepository;

@Service
public class CaffetteriaService {
	@Autowired
	private CaffetteriaRepository repository;

	public boolean inserisci(Caffetteria Caff) {
		
		return repository.insert(Caff);
	}
	public List<Caffetteria> listaCaffetteria()
	{
		return repository.findAll();
	}

}
