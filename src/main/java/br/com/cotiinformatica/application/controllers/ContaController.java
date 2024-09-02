package br.com.cotiinformatica.application.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contas")
public class ContaController {

	@PostMapping
	public void post() {
		// TODO
	}

	@PutMapping("{id}")
	public void put(@PathVariable UUID id) {
		// TODO
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable UUID id) {
		// TODO
	}

	@GetMapping
	public void getAll() {
		// TODO
	}

	@GetMapping("{id}")
	public void getById(@PathVariable UUID id) {
		// TODO
	}
}
