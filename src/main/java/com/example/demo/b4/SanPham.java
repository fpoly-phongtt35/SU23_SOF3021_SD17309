package com.example.demo.b4;

import java.math.BigDecimal;

public class SanPham {

    private Long id;
    private String ten;
    private Integer soLuongTon;
    private BigDecimal giaHienHanh;

    public SanPham() {
    }

    public SanPham(Long id, String ten, Integer soLuongTon, BigDecimal giaHienHanh) {
        this.id = id;
        this.ten = ten;
        this.soLuongTon = soLuongTon;
        this.giaHienHanh = giaHienHanh;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(Integer soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public BigDecimal getGiaHienHanh() {
        return giaHienHanh;
    }

    public void setGiaHienHanh(BigDecimal giaHienHanh) {
        this.giaHienHanh = giaHienHanh;
    }
}
