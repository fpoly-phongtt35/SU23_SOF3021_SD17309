package com.example.demo.b5.model;

public class GiangVien {

    private String maGiangVien;
    private Integer namSinh;

    public GiangVien() {
    }

    public GiangVien(String maGiangVien, Integer namSinh) {
        this.maGiangVien = maGiangVien;
        this.namSinh = namSinh;
    }

    public String getMaGiangVien() {
        return maGiangVien;
    }

    public void setMaGiangVien(String maGiangVien) {
        this.maGiangVien = maGiangVien;
    }

    public Integer getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Integer namSinh) {
        this.namSinh = namSinh;
    }
}
