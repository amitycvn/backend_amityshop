package org.example.backend.dto.request.sanPham;

import lombok.Builder;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@ToString
@Builder

public class SanPhamChiTietSearchRequest {
    private UUID idSanPham;
    private String hang;
    private String mauSac;
    private String kichThuoc;

    public UUID getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(UUID idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public SanPhamChiTietSearchRequest(UUID idSanPham, String hang, String mauSac, String kichThuoc) {
        this.idSanPham = idSanPham;
        this.hang = hang;
        this.mauSac = mauSac;
        this.kichThuoc = kichThuoc;
    }

    public String getMauSac() {
        return mauSac;
    }

    public SanPhamChiTietSearchRequest() {
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
    }
}
