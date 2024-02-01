import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a:");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("ket qua la so chan");
        }else{
            System.out.println("ket qua la so le");
        }
        scanner.close();
    }
}
