package com.poly.hangnt169.sof3021.B3_4_CRUDListFixCung.controller;

import com.poly.hangnt169.sof3021.B3_4_CRUDListFixCung.entity.SinhVien;
import com.poly.hangnt169.sof3021.B3_4_CRUDListFixCung.service.SinhVienService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SinhVienController {

//    private SinhVienService sinhVienService = new SinhVienServiceImpl();

    @Autowired
    private SinhVienService sinhVienService;

    private List<SinhVien> listSinhVien = new ArrayList<>();

    @GetMapping("/sinh-vien/hien-thi")
    public String hienThiDuLieu(Model model) {
        listSinhVien = sinhVienService.getAll();
        model.addAttribute("list", listSinhVien);
        return "/buoi3/sinhviens";
    }

    @GetMapping("/sinh-vien/view-add")
    public String viewAdd(Model model ) {
        // Khi su dung spring form / valiation => model attribute => Tao ra 1 doi tuong
        model.addAttribute("sv1",new SinhVien());
        return "/buoi3/add-sinh-vien";
    }

//    @PostMapping("/sinh-vien/add")
//    public String addSinhVien(@RequestParam("mssv") String mssv,
//                              @RequestParam("ten") String ten1,
//                              @RequestParam("tuoi") String tuoi,
//                              @RequestParam("diaChi") String diaChi,
//                              @RequestParam("gioiTinh") String gioiTinh,
//                              Model model ){
//        // B1: khoi tao Object
//        SinhVien sv = SinhVien.builder()
//                .ten(ten1)
//                .mssv(mssv)
//                .tuoi(Integer.valueOf(tuoi))
//                .diaChi(diaChi)
//                .gioiTinh(Boolean.valueOf(gioiTinh))
//                .build();
//        // B2: Goi ham add trong service
//        sinhVienService.addSinhVien(sv);
//        // B3: Quay tro lai trang chu
////        listSinhVien = sinhVienService.getAll();
////        model.addAttribute("list", listSinhVien);
////        return "/buoi3/sinhviens";
//        return "redirect:/sinh-vien/hien-thi";
//    }

    @PostMapping("/sinh-vien/add")
    public String addSinhVien(@ModelAttribute("sv1")SinhVien sv1, BindingResult result){
        // neu error => chuyen lai form add
        if(result.hasErrors()){
            return "buoi3/add-sinh-vien";
        }
        sinhVienService.addSinhVien(sv1);
        return "redirect:/sinh-vien/hien-thi";
    }
}
