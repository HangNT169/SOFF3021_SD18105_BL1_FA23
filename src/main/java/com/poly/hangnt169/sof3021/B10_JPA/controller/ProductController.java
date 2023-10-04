package com.poly.hangnt169.sof3021.B10_JPA.controller;

import com.poly.hangnt169.sof3021.B10_JPA.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/hien-thi1")
    public String hienThi(Model model) {
        model.addAttribute("list", service.getAll());
        return "buoi10/san-pham";
    }

}
