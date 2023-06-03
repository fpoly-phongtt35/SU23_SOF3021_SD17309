package com.example.demo.b12;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

@Repository
@SessionScope
public class GioHangSessionRepository implements IGioHangRepository {

    private GioHangDomainModel gioHang = new GioHangDomainModel();

    @Override
    public void themSanPhamVaoGio(Integer maSanPham, Integer soLuongThem) {
        gioHang.getDanhSachSanPham().put(maSanPham, soLuongThem);
    }

    @Override
    public void capNhapSanPhamTrongGio(Integer maSanPham, Integer soLuongThayDoi) {
        gioHang.getDanhSachSanPham().put(maSanPham, soLuongThayDoi);
    }

    @Override
    public void xoaSanPhamTrongGio(Integer maSanPham) {

    }

    @Override
    public GioHangDomainModel xemGioHang() {
        return gioHang;
    }
}
