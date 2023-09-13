package com.poly.hangnt169.sof3021.B1_Helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// Tat ca cac class trong Spring duoc dat trong com
// se duoc hieu la 1 bean
// Controller chia lam 2 loai:
// @Controller
// @RestController (J6)
// Controller la tang giao tiep giua client(FE) va server(BE)
// thong qua phuong thuc HTTP
// Co 4 phuong thuc HTTP co ban:
// GET = READ (SELECT) => Lay ra, Hien thi
// POST = CREATE (INSERT) => ADD
// PUT => UPDATE
// DETELE => DELETE: xoa
// Tuy nhien Java 5
// GET : Lay ra , Hien thi
// POST: Xu ly
public class DemoController {
    // Tat ca cac ham trong controller  LUON LUON TRA VE STRING
    //(STRING) => TEN FILE JSP
    // => Return 1 view

    @GetMapping("/demo")
    public String hienThiGiaoDien(Model model){
        // Truyen du lieu tu server(controller) => jsp
        model.addAttribute("message","TestDemo");
        return "a";
    }
}
