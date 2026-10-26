
package javaapplication13;

import java.util.ArrayList;

public class ProductManager {
    private ArrayList<Product> danhSach =
            new ArrayList<Product>();

    // Them san pham
    public void themSanPham(Product p) {
        if (timSanPham(p.getMaSP()) != null) {
            System.out.println("Ma san pham da ton tai!");
            return;
        }

        danhSach.add(p);
        System.out.println("Them san pham thanh cong!");
    }

    // Hien thi danh sach san pham
    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Chua co san pham.");
            return;
        }

        for (Product p : danhSach) {
            p.hienThi();
        }
    }

    // Tim san pham theo ma
    public Product timSanPham(String maSP) {
        for (Product p : danhSach) {
            if (p.getMaSP().equalsIgnoreCase(maSP)) {
                return p;
            }
        }

        return null;
    }
}