package HinhHoc;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    public float banKinh;
    public HinhTron(){
        ten = "Hình Tròn";
    }
    public void nhapBanKinh(){
        System.out.println("Ban kinh = ");
        Scanner sc = new Scanner(System.in);
        banKinh = sc.nextFloat();
    }
    public void tinhChuVi(){
        chuVi = 2 * Pi * banKinh;
    }
    public void tinhDienTich(){
        dienTich = Pi * banKinh * banKinh;
    }
    }

