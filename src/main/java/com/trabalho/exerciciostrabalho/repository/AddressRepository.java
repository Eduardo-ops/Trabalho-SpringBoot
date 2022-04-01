package com.trabalho.exerciciostrabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabalho.exerciciostrabalho.model.Category;

@Repository
public interface AddressRepository extends JpaRepository<Category, Integer> {
	
}
