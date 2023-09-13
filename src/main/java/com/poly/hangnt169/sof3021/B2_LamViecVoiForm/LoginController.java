package com.poly.hangnt169.sof3021.B2_LamViecVoiForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginController(){
        return "/buoi2/b";
    }

    @PostMapping("/ket-qua")
    public String hienThiKetQua(
            @RequestParam("uname")String username,
            @RequestParam("psw")String password, Model model){
        // Lay gia tri tu input(jsp) => J4: getParameter
        // J5: Request Param
        model.addAttribute("u1",password);
        model.addAttribute("u2",username);
        return "/buoi2/ket-qua";
    }
}
