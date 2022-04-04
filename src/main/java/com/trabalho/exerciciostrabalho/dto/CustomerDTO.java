package com.trabalho.exerciciostrabalho.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.trabalho.exerciciostrabalho.model.Customer;

public class CustomerDTO {

	@NotNull(message = "O valor de nome não pode ser null.")
	@NotEmpty(message = "O valor de nome não pode ser vazio.")
	private String name;

	@NotNull(message = "O valor de email não pode ser null.")
	@NotEmpty(message = "O valor de email não pode ser vazio.")
	private String email;

	@NotNull(message = "O valor de telefone não pode ser null.")
	@NotEmpty(message = "O valor de telefone não pode ser vazio.")
	@Size(max = 9, message = "o número está fora do padrão, são no total 9 dígitos.")
	private String phoneNumber;

	@NotNull(message = "O valor de tipo não pode ser null.")
	@NotEmpty(message = "O valor de tipo não pode ser vazio.")
	private Integer customerType;

	@NotNull(message = "O valor de endereço não pode ser null.")
	@NotEmpty(message = "O valor de endereço não pode ser vazio.")
	private String customerAddress;

	/*
	 * @NotNull(message = "O valor de rua não pode ser null.")
	 * 
	 * @NotEmpty(message = "O valor de rua não pode ser vazio.") private String
	 * street;
	 * 
	 * @NotNull(message = "O valor de número não pode ser null.")
	 * 
	 * @NotEmpty(message = "O valor de número não pode ser vazio.") private String
	 * number;
	 * 
	 * @NotNull(message = "O valor de extra não pode ser null.")
	 * 
	 * @NotEmpty(message = "O valor de extra não pode ser vazio.") private String
	 * extra;
	 * 
	 * @NotNull(message = "O valor de vizinho não pode ser null.")
	 * 
	 * @NotEmpty(message = "O valor de vizinho não pode ser vazio.") private String
	 * neighbour;
	 * 
	 * @NotNull(message = "O valor de código postal não pode ser null.")
	 * 
	 * @NotEmpty(message = "O valor de código postal não pode ser vazio.")
	 * 
	 * private String zipCode;
	 * 
	 * @NotNull(message = "O valor de cidade não pode ser null.")
	 * 
	 * @NotEmpty(message = "O valor de cidade não pode ser vazio.") private String
	 * city;
	 * 
	 * @NotNull(message = "O valor de e não pode ser null.")
	 * 
	 * @NotEmpty(message = "O valor de cidade não pode ser vazio.") private String
	 * state;
	 */

	public CustomerDTO(Customer customer) {
		this.name = customer.getName();
		this.email = customer.getEmail();
		this.phoneNumber = customer.getPhoneNumber();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getCustomerType() {
		return customerType;
	}

	public void setCustomerType(Integer customerType) {
		this.customerType = customerType;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	/*
	 * public String getStreet() { return street; }
	 * 
	 * public void setStreet(String street) { this.street = street; }
	 * 
	 * public String getNumber() { return number; }
	 * 
	 * public void setNumber(String number) { this.number = number; }
	 * 
	 * public String getExtra() { return extra; }
	 * 
	 * public void setExtra(String extra) { this.extra = extra; }
	 * 
	 * public String getNeighbour() { return neighbour; }
	 * 
	 * public void setNeighbour(String neighbour) { this.neighbour = neighbour; }
	 * 
	 * public String getZipCode() { return zipCode; }
	 * 
	 * public void setZipCode(String zipCode) { this.zipCode = zipCode; }
	 * 
	 * public String getCity() { return city; }
	 * 
	 * public void setCity(String city) { this.city = city; }
	 * 
	 * public String getState() { return state; }
	 * 
	 * public void setState(String state) { this.state = state; }
	 */

}
