package com.example.demo.b12;

import com.example.demo.b7.IProductRepository;
import com.example.demo.b7.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class GioHangService {

    @Autowired
    private IGioHangRepository repository;

    @Autowired
    private IProductRepository sanPhamRepository;

    public void themSanPhamVaoGio(Integer maSanPham, Integer soLuong) {
        // Check số lượng <= số lượng hiện có
    }

    public void boSanPhamKhoiGio(Integer maSanPham, Integer soLuong) {
        // Check số lượng > 0
    }

    public GioHangViewModel xemGioHang() {
        GioHangViewModel viewModel = new GioHangViewModel();

        GioHangDomainModel domainModel = repository.xemGioHang();
        for(Map.Entry<Integer, Integer> entry :
            domainModel.getDanhSachSanPham().entrySet()) {
            Integer maSanPham = entry.getKey();
            Integer soLuong = entry.getValue();

            Product sanPham = sanPhamRepository.findById(maSanPham).get();

            SanPhamTrongGio sanPhamTrongGio = new SanPhamTrongGio();
            sanPhamTrongGio.setMaSanPham(maSanPham);
            sanPhamTrongGio.setSoLuong(soLuong);
            sanPhamTrongGio.setDonGia(sanPham.getPrice());
            sanPhamTrongGio.setTenSanPham(sanPham.getProductName());
        }

        return viewModel;
    }
}
