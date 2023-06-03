package com.example.demo.b12;

public interface IGioHangRepository {

    void themSanPhamVaoGio(Integer maSanPham, Integer soLuongThem);

    void capNhapSanPhamTrongGio(Integer maSanPham, Integer soLuongThayDoi);

    void xoaSanPhamTrongGio(Integer maSanPham);

    GioHangDomainModel xemGioHang();
}
