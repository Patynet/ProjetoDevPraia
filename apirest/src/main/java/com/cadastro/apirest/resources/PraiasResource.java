package com.cadastro.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.apirest.models.Bairros;
import com.cadastro.apirest.models.Praias;
import com.cadastro.apirest.repository.PraiasRepository;

@RestController
@RequestMapping(value="/api")
public class PraiasResource {
	
	@Autowired
	PraiasRepository praiasRepository;
	
	
	@GetMapping("/praias")
	public List <Praias> listapraias() {
		return praiasRepository.findAll();
		
	}
	
	@GetMapping("/praias/{id}")
	public Praias listapraiaUnico(@PathVariable(value="id")long id) {
		return praiasRepository.findById(id);
		
	}
	
	@PostMapping("/praias")
	public Praias salvaPraia(@RequestBody Praias praia) {
	return praiasRepository.save(praia);
	}
	
	@DeleteMapping("/praias")
	public void deletaPraias(@RequestBody Praias praia) {
	       praiasRepository.delete(praia);
	}
	@PutMapping("/praias")
	public Praias atualizaPraias(@RequestBody Praias praia) {
	      return praiasRepository.save(praia);
}
}
