package com.poly.hangnt169.sof3021.B10_JPA.service;

import com.poly.hangnt169.sof3021.B10_JPA.entity.Category;
import com.poly.hangnt169.sof3021.B10_JPA.repository.CategoryRepository;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CategoryService {

    List<Category>getAll();

    void add(Category category);

    Page<Category>phanTrang(int page, int size);

}
