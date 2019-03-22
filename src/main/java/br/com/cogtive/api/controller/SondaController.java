package br.com.cogtive.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cogtive.api.model.Sonda;
import br.com.cogtive.api.service.SondaService;

@RestController
@RequestMapping("/sonda")
public class SondaController {
	
	@Autowired
	private SondaService sondaService;
	
	@PostMapping
	public ResponseEntity<Sonda> processar(@RequestBody Sonda sonda) {
		sondaService.iniciaProcessamento(sonda);
		return ResponseEntity.status(HttpStatus.OK).body(sonda);
	}
}
