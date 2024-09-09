package br.com.cotiinformatica.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.domain.models.dtos.ContaCategoriaRequestDto;
import br.com.cotiinformatica.domain.models.dtos.ContaCategoriaResponseDto;
import br.com.cotiinformatica.domain.services.interfaces.ContaCategoriaDomainService;

@RestController
@RequestMapping("/api/conta-catgoria")
public class ContaCategoriaController {

	@Autowired
	private ContaCategoriaDomainService contaCategoriaDomainService;

	@PostMapping
	public ContaCategoriaResponseDto post(@RequestBody ContaCategoriaRequestDto request) throws Exception {
		return contaCategoriaDomainService.inserir(request);
	}

}
