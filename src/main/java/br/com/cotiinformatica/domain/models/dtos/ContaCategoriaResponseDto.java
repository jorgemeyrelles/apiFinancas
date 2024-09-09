
package br.com.cotiinformatica.domain.models.dtos;

import lombok.Data;

@Data
public class ContaCategoriaResponseDto {
	private ContaResponseDto conta;
	private CategoriaResponseDto categoria;
}