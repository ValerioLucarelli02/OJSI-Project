package model.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import model.Caffetteria;
import model.dto.CaffetteriaDto;
import model.repository.CaffeteriaRepository;

@Service
public class CaffetteriaService {
	
	@Autowired
	private CaffeteriaRepository repo;
	
	@Autowired
	private ModelMapper mapper;
	
	public boolean inserisciCaff (CaffetteriaDto caffDto) {
		
		Caffetteria caff = mapper.map(caffDto, Caffetteria.class);
		Caffetteria salvato = repo.save(caff);
		
		if(salvato!=null) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public CaffetteriaDto findById (Integer varId) {
		
		Caffetteria caff = repo.findById(varId).orElse(null);
		if(caff!=null)
			return null;
		
		return mapper.map(caff, CaffetteriaDto.class);
		
	}
	
	public CaffetteriaDto findByCodice (String varCodice) {
		
		Caffetteria caff = repo.findByCodice(varCodice);
		if(caff!=null)
			return null;
		
		return mapper.map(caff, CaffetteriaDto.class);
		
	}
	
	public CaffetteriaDto aggiornaCaff (String varCodice, CaffetteriaDto Caff) {
		//inserire controllo null
		Caffetteria caff = repo.findByCodice(varCodice);
		CaffetteriaDto dto = new CaffetteriaDto();
		dto = mapper.map(caff, CaffetteriaDto.class);
	
		
		return dto;
		
		
	}
	
	public boolean eliminaCaffetteria (String varCodice) {
		
		Caffetteria caff = repo.findByCodice(varCodice);
		
		try {
			repo.delete(caff);
		} catch(Exception e) {
			return false;
		}
		return true;
	}
	
	public List<CaffetteriaDto> findall(){
		

		List<Caffetteria> listcaff = repo.findAll();
		
		if(listcaff == null)
			return null;
		
		List<CaffetteriaDto> listCaffDto = new ArrayList<>();
		
		
		for(Caffetteria caf : listcaff)
			listCaffDto.add(mapper.map(caf, CaffetteriaDto.class));
		
		return listCaffDto;
		
	}
	
	
}
	