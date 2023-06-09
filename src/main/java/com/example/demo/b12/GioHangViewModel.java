package com.example.demo.b12;

import java.math.BigDecimal;
import java.util.List;

public class GioHangViewModel {

    private List<SanPhamTrongGio> sanPhamTrongGios;

    public BigDecimal getTongTien() {
        return sanPhamTrongGios.stream()
                .map(s -> s.getThanhTien())
                .reduce(BigDecimal.ZERO, (a,b) -> a.add(b));
    }

    public List<SanPhamTrongGio> getSanPhamTrongGios() {
        return sanPhamTrongGios;
    }

    public void setSanPhamTrongGios(List<SanPhamTrongGio> sanPhamTrongGios) {
        this.sanPhamTrongGios = sanPhamTrongGios;
    }
}

class SanPhamTrongGio {

    private Integer maSanPham;
    private String tenSanPham;
    private BigDecimal donGia;
    private Integer soLuong;

    public BigDecimal getThanhTien() {
        return donGia.multiply(BigDecimal.valueOf(soLuong));
    }

    public Integer getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(Integer maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public BigDecimal getDonGia() {
        return donGia;
    }

    public void setDonGia(BigDecimal donGia) {
        this.donGia = donGia;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }
}
