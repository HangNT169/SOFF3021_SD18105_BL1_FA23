package com.poly.hangnt169.sof3021.B10_JPA.controller;

import com.poly.hangnt169.sof3021.B10_JPA.entity.Category;
import com.poly.hangnt169.sof3021.B10_JPA.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    private List<Category> list = new ArrayList<>();
    // Hien thi du lieu len table

    @GetMapping("/hien-thi")
    private String hienThi(Model model){
        list = categoryService.getAll();
        model.addAttribute("list", list);
        return "/buoi10/hienthi";
    }
}
