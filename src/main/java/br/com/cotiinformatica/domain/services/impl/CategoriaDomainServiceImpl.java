package br.com.cotiinformatica.domain.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.cotiinformatica.domain.models.dtos.CategoriaRequestDto;
import br.com.cotiinformatica.domain.models.dtos.CategoriaResponseDto;
import br.com.cotiinformatica.domain.services.interfaces.CategoriaDomainService;

@Service
public class CategoriaDomainServiceImpl implements CategoriaDomainService {

	@Override
	public CategoriaResponseDto inserir(CategoriaRequestDto request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategoriaResponseDto atualizar(UUID id, CategoriaRequestDto request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategoriaResponseDto excluir(UUID id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CategoriaResponseDto> consultar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategoriaResponseDto obterPorId(UUID id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
