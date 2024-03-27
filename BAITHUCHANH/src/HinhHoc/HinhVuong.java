package HinhHoc;

public class HinhVuong extends HinhChuNhat{
    public HinhVuong(){
        ten = "Hinh vuong";
        dai = rong;
    }
    public void nhapCanh(){
        System.out.println("Nhap chieu dai canh : ");
        dai = rong = sc.nextFloat();
    }
}
