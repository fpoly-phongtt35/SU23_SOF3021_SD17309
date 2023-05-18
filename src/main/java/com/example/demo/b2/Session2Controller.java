package com.example.demo.b2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Calendar;

@Controller
public class Session2Controller {

    @RequestMapping("/b2")
    public String welcome() {
        return "index";
    }

    @RequestMapping("/b2/sinh-vien")
    public String listSinhVien(Model model) {
        String[] list = new String[] {"MinhDQ8", "DungNA29", "TienNH21", "LinhTD15"};

        model.addAttribute("listSinhVien", list);

        return "b2/sinh-vien";
    }

    @GetMapping("/b2/tinh-tuoi")
    public String getTinhTuoi() {
        return "b2/tinh-tuoi";
    }

    @PostMapping("/b2/tinh-tuoi")
    public String postTinhTuoi(Model model
        , @RequestParam(name = "year") Integer namSinh) {
        Integer namHienTai = Calendar.getInstance().get(Calendar.YEAR);
        Integer tuoi = namHienTai - namSinh;
        model.addAttribute("age", tuoi);
        return "b2/tinh-tuoi";
    }
}
