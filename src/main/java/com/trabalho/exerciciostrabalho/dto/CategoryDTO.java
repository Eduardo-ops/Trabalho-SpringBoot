package com.trabalho.exerciciostrabalho.dto;

import com.trabalho.exerciciostrabalho.model.Category;

public class CategoryDTO {

	private String category;
	private Integer priority;
	private String priorityCategory;

	public CategoryDTO() {

	}

	public CategoryDTO(Category category) {

	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getPriorityCategory() {
		return priorityCategory;
	}

	public void setPriorityCategory(String priorityCategory) {
		this.priorityCategory = priorityCategory;
	}

}
