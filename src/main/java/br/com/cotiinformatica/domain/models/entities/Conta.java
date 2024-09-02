package br.com.cotiinformatica.domain.models.entities;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import br.com.cotiinformatica.domain.models.enums.TipoConta;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name = "tb_conta")
@Data
public class Conta {
	@Id
	@Column(name = "id")
	private UUID id;

	@Column(name = "nome", length = 150, nullable = false)
	private String nome;

	@Temporal(TemporalType.DATE)
	@Column(name = "data", nullable = false)
	private Date data;

	@Column(name = "valor", precision = 10, scale = 2, nullable = false)
	private Double valor;

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo", nullable = false)
	private TipoConta tipo;

	@ManyToMany
	@JoinTable(name = "conta_categoria",
		joinColumns = @JoinColumn(name = "conta_id"),
		inverseJoinColumns = @JoinColumn(name = "categoria_id"))
	private List<Categoria> categoria;
}
