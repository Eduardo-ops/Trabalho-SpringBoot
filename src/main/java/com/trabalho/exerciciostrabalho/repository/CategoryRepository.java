package com.trabalho.exerciciostrabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trabalho.exerciciostrabalho.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
}
