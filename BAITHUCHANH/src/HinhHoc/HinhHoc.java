package HinhHoc;

public class HinhHoc {
    public static void main(String[] args) {
        HinhHoc hh = new HinhHoc();
        hh.xuatTen();
        hh.inChuVi();
        hh.inDienTich();
        hh.inTheTich();
    }
    public final float Pi = 3.14f;
    public String ten;
    public float chuVi;
    public float dienTich;
    public float theTich;
    public void xuatTen(){
        System.out.println("Tên =" + ten);
    }
    public void inChuVi(){
        System.out.println("Chu vi =" + chuVi);
    }
    public void inDienTich(){
        System.out.println("Dien tich =" + dienTich);
    }
    public void inTheTich(){
        System.out.println("The tich =" + theTich);
    }
}
