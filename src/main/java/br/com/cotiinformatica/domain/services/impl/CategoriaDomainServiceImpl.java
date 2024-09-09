package br.com.cotiinformatica.domain.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cotiinformatica.domain.models.dtos.CategoriaRequestDto;
import br.com.cotiinformatica.domain.models.dtos.CategoriaResponseDto;
import br.com.cotiinformatica.domain.models.entities.Categoria;
import br.com.cotiinformatica.domain.services.interfaces.CategoriaDomainService;
import br.com.cotiinformatica.infrastructure.repositories.CategoriaRepository;

@Service
public class CategoriaDomainServiceImpl implements CategoriaDomainService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CategoriaResponseDto inserir(CategoriaRequestDto request) throws Exception {
		// copia os valores de campos iguais de request para categoria
		Categoria categoria = modelMapper.map(request, Categoria.class);
		// campo que precisa ser preenchido mas não vem em request
		categoria.setId(UUID.randomUUID());

		categoriaRepository.save(categoria);

		CategoriaResponseDto response = modelMapper.map(categoria, CategoriaResponseDto.class);

		return response;
	}

	@Override
	public CategoriaResponseDto atualizar(UUID id, CategoriaRequestDto request) throws Exception {
		// consulta existencia da categoria
		// caso não exista, retorna erro
		Categoria categoria = categoriaRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Categoria não encontrada. Verifique Id informado."));
		// caso categoria exista, atualiza com valores de request
		categoria.setNome(request.getNome());
		// sava no banco
		categoriaRepository.save(categoria);
		// dto de response
		CategoriaResponseDto response = modelMapper.map(categoria, CategoriaResponseDto.class);
		return response;
	}

	@Override
	public CategoriaResponseDto excluir(UUID id) throws Exception {
		Categoria categoria = categoriaRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Categoria não encontrada. Verifique o Id informado."));

		categoriaRepository.delete(categoria);

		CategoriaResponseDto response = modelMapper.map(categoria, CategoriaResponseDto.class);
		return response;
	}

	@Override
	public List<CategoriaResponseDto> consultar() throws Exception {
		List<Categoria> categorias = categoriaRepository.findAll();

		List<CategoriaResponseDto> response = new ArrayList<CategoriaResponseDto>();

		for (Categoria categoria : categorias) {
			response.add(modelMapper.map(categoria, CategoriaResponseDto.class));
		}
		return response;
	}

	@Override
	public CategoriaResponseDto obterPorId(UUID id) throws Exception {
		Categoria categoria = categoriaRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Categoria não enconrada. Verifique o Id informado."));

		CategoriaResponseDto response = modelMapper.map(categoria, CategoriaResponseDto.class);

		return response;
	}

}
