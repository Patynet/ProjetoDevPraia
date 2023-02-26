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
import com.cadastro.apirest.repository.BairrosRepository;

@RestController
@RequestMapping(value="/api")
public class BairrosResource {
	
	@Autowired
	BairrosRepository bairrosRepository;
	
@GetMapping("/bairros")
public List <Bairros> listabairro() {
return bairrosRepository.findAll();
		
	}
	
@GetMapping("/bairros/{id}")
public Bairros listabairroUnico(@PathVariable(value="id")long id) {
return bairrosRepository.findById(id);
		
}

@PostMapping("/bairros")
public Bairros salvaBairro(@RequestBody Bairros bairro) {
return bairrosRepository.save(bairro);
}

@DeleteMapping("/bairros")
public void deletaBairro(@RequestBody Bairros bairro) {
       bairrosRepository.delete(bairro);
}
@PutMapping("/bairros")
public Bairros atualizaBairros(@RequestBody Bairros bairros) {
      return bairrosRepository.save(bairros);
}
}
