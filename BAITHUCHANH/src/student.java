import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Sinhvien sv = new student(). new Sinhvien();
        sv.Nhapthongtin();
        sv.Xuatthongtin();
        sv.Diemtongket();
    }
    public class Sinhvien {
    public String Ten;
    public int Tuoi;
    public float DiemA, DiemB, DiemC;
    public float DiemTk;
    public void Nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten sinh vien: ");
        Ten = sc.nextLine();
        System.out.println("Tuoi cua sinh vien: ");
        Tuoi = sc.nextInt();
        System.out.println("Diem A: ");
        DiemA = sc.nextFloat();
        System.out.println("Diem B: ");
        DiemB = sc.nextFloat();
        System.out.println("Diem C: ");
        DiemC = sc.nextFloat();
        sc.close();
    }
    public void Xuatthongtin{
        System.out.println("Ten sinh vien " + Ten);
        System.out.println("Tuoi cua sinh vien: " + Tuoi);
        System.out.println("Diem A: " + DiemA);
        System.out.println("Diem B: " + DiemB);
        System.out.println("Diem C: " + DiemC);
    }
    public void DiemTongKet(){
        DiemTk = (DiemA + DiemB + DiemC) /3;
        System.out.println("Diem Tong Ket:" + DiemTk);
    }
    }
    }
