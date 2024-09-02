package br.com.cotiinformatica.domain.services.interfaces;

import java.util.List;
import java.util.UUID;

import br.com.cotiinformatica.domain.models.dtos.CategoriaRequestDto;
import br.com.cotiinformatica.domain.models.dtos.CategoriaResponseDto;

public interface CategoriaDomainService {

	public CategoriaResponseDto inserir(CategoriaRequestDto request) throws Exception;

	public CategoriaResponseDto atualizar(UUID id, CategoriaRequestDto request) throws Exception;

	public CategoriaResponseDto excluir(UUID id) throws Exception;
	
	public List<CategoriaResponseDto> consultar() throws Exception;

	public CategoriaResponseDto obterPorId(UUID id) throws Exception;
}
