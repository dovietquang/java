package HinhHoc;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float chieuCao;
    public HinhTru(){
        ten = "Hình Trụ";
    }
    public void nhapChieuCao(){
        nhapBanKinh();
        System.out.println("Chieu cao = ");
        Scanner sc = new Scanner(System.in);
        chieuCao = sc.nextFloat();
    }
    public void tinhTheTich(){
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
}
