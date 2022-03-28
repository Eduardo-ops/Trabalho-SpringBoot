package com.trabalho.exerciciostrabalho.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int numberOfinstallments;
	private int installmentsPaid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumberOfinstallments() {
		return numberOfinstallments;
	}

	public void setNumberOfinstallments(int numberOfinstallments) {
		this.numberOfinstallments = numberOfinstallments;
	}

	public int getInstallmentsPaid() {
		return installmentsPaid;
	}

	public void setInstallmentsPaid(int installmentsPaid) {
		this.installmentsPaid = installmentsPaid;
	}

}
