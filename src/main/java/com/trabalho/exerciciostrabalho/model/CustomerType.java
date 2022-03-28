package com.trabalho.exerciciostrabalho.model;

import java.util.stream.Stream;

public enum CustomerType {

	PESSOAFISICA(1), PESSOAJURIDICA(2);

	private int pessoaFisica;
	private int pessoaJuridica;

	CustomerType(int tipo) {
		this.pessoaFisica = tipo;
		this.pessoaJuridica = tipo;
	}

	public int getpessoaFisica() {
		return pessoaFisica;
	}

	public int getpessoaJuridica() {
		return pessoaJuridica;
	}
}
