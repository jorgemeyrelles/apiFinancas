package br.com.cotiinformatica.domain.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cotiinformatica.domain.models.dtos.CategoriaResponseDto;
import br.com.cotiinformatica.domain.models.dtos.ContaCategoriaRequestDto;
import br.com.cotiinformatica.domain.models.dtos.ContaCategoriaResponseDto;
import br.com.cotiinformatica.domain.models.dtos.ContaResponseDto;
import br.com.cotiinformatica.domain.models.entities.Categoria;
import br.com.cotiinformatica.domain.models.entities.Conta;
import br.com.cotiinformatica.domain.services.interfaces.ContaCategoriaDomainService;
import br.com.cotiinformatica.infrastructure.repositories.CategoriaRepository;
import br.com.cotiinformatica.infrastructure.repositories.ContaRepository;

@Service
public class ContaCategoriaDomainServiceImpl implements ContaCategoriaDomainService {

	@Autowired
	private ContaRepository contaRepository;

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public ContaCategoriaResponseDto inserir(ContaCategoriaRequestDto request) throws Exception {
		Conta conta = contaRepository.findById(request.getContaId())
				.orElseThrow(() -> new IllegalArgumentException("Conta não encontrada."));

		Categoria categoria = categoriaRepository.findById(request.getCategoriaId())
				.orElseThrow(() -> new IllegalArgumentException("Catgoria não encontrada"));

		conta.getCategoria().add(categoria);
		
		// atualiza conta com id de 
		contaRepository.save(conta);

		ContaCategoriaResponseDto response = new ContaCategoriaResponseDto();

		response.setConta(modelMapper.map(conta, ContaResponseDto.class));
		response.setCategoria(modelMapper.map(categoria, CategoriaResponseDto.class));

		return response;
	}

}
