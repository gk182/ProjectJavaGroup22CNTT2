
package Controller;


public class Giay {
    private int MaGiay;
    private String TenGiay;
    private int SoLuong;
    private String NCC;
    private double GiaTien;
    private int Size;

    public Giay(int MaGiay, String TenGiay, int SoLuong, String NCC, double GiaTien, int Size) {
        this.MaGiay = MaGiay;
        this.TenGiay = TenGiay;
        this.SoLuong = SoLuong;
        this.NCC = NCC;
        this.GiaTien = GiaTien;
        this.Size = Size;
    }

    public int getMaGiay() {
        return MaGiay;
    }

    public void setMaGiay(int MaGiay) {
        this.MaGiay = MaGiay;
    }

    public String getTenGiay() {
        return TenGiay;
    }

    public void setTenGiay(String TenGiay) {
        this.TenGiay = TenGiay;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getNCC() {
        return NCC;
    }

    public void setNCC(String NCC) {
        this.NCC = NCC;
    }

    public double getGiaTien() {
        return GiaTien;
    }

    public void setGiaTien(double GiaTien) {
        this.GiaTien = GiaTien;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }
    
    
    
}
