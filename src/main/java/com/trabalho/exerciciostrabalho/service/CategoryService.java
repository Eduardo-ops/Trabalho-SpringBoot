package com.trabalho.exerciciostrabalho.service;

import org.springframework.stereotype.Service;

import com.trabalho.exerciciostrabalho.dto.CategoryDTO;
import com.trabalho.exerciciostrabalho.model.Category;
import com.trabalho.exerciciostrabalho.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository catRepo;

	public void createCategory(Category category) {
		catRepo.save(category);
	}

	public void deleteCategory(Integer id) {

	}

}
