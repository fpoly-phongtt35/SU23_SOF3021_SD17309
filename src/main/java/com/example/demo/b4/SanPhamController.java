package com.example.demo.b4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.ArrayList;

@Controller
@RequestMapping("/b4/san-pham")
public class SanPhamController {

    private static final ArrayList<SanPham> dsSanPham = new ArrayList<>();
    static {
        dsSanPham.add(new SanPham(1L, "Chuoi", 213, BigDecimal.valueOf(20000)));
        dsSanPham.add(new SanPham(2L, "Cam", 23, BigDecimal.valueOf(9000)));
        dsSanPham.add(new SanPham(3L, "Mang cut", 38882, BigDecimal.valueOf(50000)));
        dsSanPham.add(new SanPham(4L, "Quyt", 43, BigDecimal.valueOf(24000)));
        dsSanPham.add(new SanPham(5L, "Tao", 999, BigDecimal.valueOf(53000)));
    }

    @GetMapping
    public String viewSanPham(Model model) {
        model.addAttribute("danhSachSanPham", dsSanPham);
        return "b4/product";
    }
}
