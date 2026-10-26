
package javaapplication13;

public class Product {
    private String maSP;
    private String tenSP;
    private double giaBan;
    private int soLuong;

    public Product(String maSP, String tenSP,
                   double giaBan, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void hienThi() {
        System.out.println(
            maSP + " - " + tenSP + " - "
            + giaBan + " - " + soLuong
        );
    }
}