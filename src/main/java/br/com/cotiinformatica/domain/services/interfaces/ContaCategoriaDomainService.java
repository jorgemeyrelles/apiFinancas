package br.com.cotiinformatica.domain.services.interfaces;

import br.com.cotiinformatica.domain.models.dtos.ContaCategoriaRequestDto;
import br.com.cotiinformatica.domain.models.dtos.ContaCategoriaResponseDto;

public interface ContaCategoriaDomainService {
	public ContaCategoriaResponseDto inserir(ContaCategoriaRequestDto request) throws Exception;

}
