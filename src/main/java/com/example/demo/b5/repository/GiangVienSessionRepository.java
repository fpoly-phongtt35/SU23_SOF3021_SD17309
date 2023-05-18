package com.example.demo.b5.repository;

import com.example.demo.b5.model.GiangVien;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component("SessionRepo")
public class GiangVienSessionRepository implements IGiangVienRepository {

    private static ArrayList<GiangVien> DANH_SACH_GIANG_VIEN = new ArrayList<>();
    static {
        DANH_SACH_GIANG_VIEN.add(new GiangVien("NguyenVV4", 2003));
        DANH_SACH_GIANG_VIEN.add(new GiangVien("HangNT169", 2002));
        DANH_SACH_GIANG_VIEN.add(new GiangVien("PhongTT35", 2001));
    }

    @Override
    public ArrayList<GiangVien> getAll() {
        return DANH_SACH_GIANG_VIEN;
    }
}
