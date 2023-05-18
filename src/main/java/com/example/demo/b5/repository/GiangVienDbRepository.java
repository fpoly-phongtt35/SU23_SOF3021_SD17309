package com.example.demo.b5.repository;

import com.example.demo.b5.model.GiangVien;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository("DbRepo")
public class GiangVienDbRepository implements IGiangVienRepository {

    private static ArrayList<GiangVien> DANH_SACH_GIANG_VIEN = new ArrayList<>();
    static {
        DANH_SACH_GIANG_VIEN.add(new GiangVien("DungNA21", 2003));
        DANH_SACH_GIANG_VIEN.add(new GiangVien("MinhDQ29", 2002));
        DANH_SACH_GIANG_VIEN.add(new GiangVien("TienNH8", 2001));
    }

    @Override
    public ArrayList<GiangVien> getAll() {
        return DANH_SACH_GIANG_VIEN;
    }
}
