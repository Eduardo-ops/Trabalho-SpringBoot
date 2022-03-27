package com.trabalho.exerciciostrabalho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabalho.exerciciostrabalho.service.CategoryService;


@RestController
@RequestMapping("/categories")
public class CategoryController {

	@Autowired
	CategoryService categoryServgice;

}
