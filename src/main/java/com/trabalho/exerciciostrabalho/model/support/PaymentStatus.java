package com.trabalho.exerciciostrabalho.model.support;

import java.util.stream.Stream;

public enum PaymentStatus {

	PENDENTE(1), PAGO(2), CANCELADO(3);

	private int pending;
	private int paid;
	private int canceled;

	PaymentStatus(int atual) {
		this.pending = atual;
		this.paid = atual;
		this.canceled = atual;
	}

	public int getPending() {
		return pending;
	}

	public int getpaid() {
		return paid;
	}

	public int getCanceled() {
		return canceled;
	}
}
