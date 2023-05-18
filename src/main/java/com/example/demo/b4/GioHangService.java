package com.example.demo.b4;

import java.util.Map;

public class GioHangService {

    private final GioHang gioHang = new GioHang();

    public Map<Long, Integer> laySanPhamTrongGio() {
        return gioHang.getSanPhamTrongGio();
    }

    public void themSanPhamVaoGio(Long sanPhamCanThem, Integer soLuongChoVao) {
        Map<Long, Integer> sanPhamTrongGio = gioHang.getSanPhamTrongGio();

        // Nếu sản phẩm đã có trong giỏ
        if (sanPhamTrongGio.containsKey(sanPhamCanThem)) { // thì thực hiện cộng dồn số lượng
            // B1. Lấy số lượng hiện tại
            Integer soLuongHienCo = sanPhamTrongGio.get(sanPhamCanThem);

            // B2. Cộng dồn
            Integer soLuongMoi = soLuongHienCo + soLuongChoVao;

            // B3. Cập nhập lại giỏ hàng
            sanPhamTrongGio.put(sanPhamCanThem, soLuongMoi);
        } else { // nếu chưa có thì thêm mới
            sanPhamTrongGio.put(sanPhamCanThem, soLuongChoVao);
        }
    }
}
