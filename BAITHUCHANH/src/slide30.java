import java.util.Scanner;

public class slide30 {
    public static void main(String[] args) {
        int n, sodu, tong=0;
        Scanner sc= new Scanner(system.in);
        System.out.println("Nhap vao so nguyen duong bat ky:");
        n =sc.nextInt();
        while (n>0){
            sodu =n%10;
            n=n/10;
            tong = tong + sodu;
        }
        System.out.println("tong cac chu so =" + tong);
        sc.close();
    }
}
