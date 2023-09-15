package com.poly.hangnt169.sof3021.B3_4_CRUDListFixCung.controller;

import com.poly.hangnt169.sof3021.B3_4_CRUDListFixCung.entity.SinhVien;
import com.poly.hangnt169.sof3021.B3_4_CRUDListFixCung.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SinhVienController {

//    private SinhVienService sinhVienService = new SinhVienServiceImpl();

    @Autowired
    private SinhVienService sinhVienService;

    private List<SinhVien>listSinhVien = new ArrayList<>();

    @GetMapping("/sinh-vien/hien-thi")
    public String hienThiDuLieu(Model model) {
        listSinhVien = sinhVienService.getAll();
        model.addAttribute("list", listSinhVien);
        return "/buoi3/sinhviens";
    }

}
