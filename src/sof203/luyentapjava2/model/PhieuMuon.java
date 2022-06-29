/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sof203.luyentapjava2.model;

/**
 *
 * @author nguyenvv
 */
public class PhieuMuon {

    private String tenSv;

    private String boMon;

    private Boolean gioiTinh;

    private String tenSach;

    public PhieuMuon() {
    }

    public PhieuMuon(String tenSv, String boMon, Boolean gioiTinh, String tenSach) {
        this.tenSv = tenSv;
        this.boMon = boMon;
        this.gioiTinh = gioiTinh;
        this.tenSach = tenSach;
    }

    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public String getBoMon() {
        return boMon;
    }

    public void setBoMon(String boMon) {
        this.boMon = boMon;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String hienThiGioiTinh() {
        if (gioiTinh) {
            return "Nam";
        }
        return "Nữ";
    }

}
