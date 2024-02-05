import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so nguyen duong:");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Nhap lai 1 so nguyen duong:");
        }else{
            long giaithua = tinhgiaithua(n);
            System.out.println("giai thua cua" + n + "la:" + giaithua);
        }
        sc.close();
    }
    public static long tinhgiaithua(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * tinhgiaithua(n - 1);
        }
    
    }
}
            