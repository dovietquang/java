import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tong = 0;
        String reString = "" ;
        while (tong <= 100) {
            System.out.println("Nhap gia tri :");
            int n = sc.nextInt();
            tong = tong + n;
            reString = reString + n + "+";
        }
        System.out.println(reString.substring(0,reString.length()-2)+"="+tong);
        sc.close();
    }
}
