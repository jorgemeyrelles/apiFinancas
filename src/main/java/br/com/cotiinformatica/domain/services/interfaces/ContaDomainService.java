package br.com.cotiinformatica.domain.services.interfaces;

import java.util.List;
import java.util.UUID;

import br.com.cotiinformatica.domain.models.dtos.ContaRequestDto;
import br.com.cotiinformatica.domain.models.dtos.ContaResponseDto;

public interface ContaDomainService {

	public ContaResponseDto inserir(ContaRequestDto request) throws Exception;

	public ContaResponseDto atualizar(UUID id, ContaRequestDto request) throws Exception;

	public ContaResponseDto excluir(UUID id) throws Exception;

	public List<ContaResponseDto> consultar() throws Exception;

	public ContaResponseDto obterPorId(UUID id) throws Exception;
}
