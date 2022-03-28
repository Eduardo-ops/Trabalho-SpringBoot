package com.trabalho.exerciciostrabalho.model;

import java.util.stream.Stream;

public enum PaymentStatus {

	EXEMPLO(10, 20, 30), EXEMPLOII(30, 40, 50);

	private int pending;
	private int paid;
	private int canceled;

	PaymentStatus(int pendinga, int paid, int canceled) {
		this.pending = pending;
		this.paid = paid;
		this.canceled = canceled;
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
