package com.trabalho.exerciciostrabalho.service;

import org.springframework.stereotype.Service;

import com.trabalho.exerciciostrabalho.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

}
