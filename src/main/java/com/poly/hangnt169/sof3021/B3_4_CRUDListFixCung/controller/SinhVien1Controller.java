package com.poly.hangnt169.sof3021.B3_4_CRUDListFixCung.controller;

import com.poly.hangnt169.sof3021.B3_4_CRUDListFixCung.entity.SinhVien;
import com.poly.hangnt169.sof3021.B3_4_CRUDListFixCung.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SinhVien1Controller {

    @Autowired
    private SinhVienService sinhVienService;

    @GetMapping("/test1")
    public List<SinhVien> getAll(){
        return sinhVienService.getAll();
    }
}
