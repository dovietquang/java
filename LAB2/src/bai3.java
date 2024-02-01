import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        string ten;
        int tuoi, namsinh;
        System.out.println("ho va ten:");
        ten = sc.nextLine();
        System.err.println("sinh nam:");
        namsinh = sc.nextInt();
        tuoi = 2024 - namsinh;
        sc.close();
        if (tuoi < 16) {
            System.out.println("ban" + ten + "o do tuoi truong thanh");
        }else{
            if (tuoi>=16 && tuoi<18) {
                System.out.println("ban" + ten + "o do tuoi truong thanh");
            }else{
                System.out.println("ban" + ten + "da gia");
            }
        }
    }
}
