import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        double so1, so2;
        Scanner scanner = new scanner(system.in);
        System.out.println("Nhap so thu nhat:");
        so1 = scanner.nextDouble();
        System.out.println("Nhap so thu hai;");
        so2 = scanner.nextDouble();
        double tong = so1 + so2;
        double hieu = so1 - so2;
        double tich = so1 * so2;
        double thuong = so1 / so2;
        double chiadu = so1 % so2;
        System.out.println("tong:"+ tong);
        System.out.println("hieu:"+ hieu);
        System.out.println("tich:"+ tich);
        System.out.println("thuong:"+ thuong);
        System.out.println("chiadu:"+ chiadu);
        if (so1 > so2) {
            System.out.println(so1 + ">" + so2);
        }else if (so1 < so2) {
            System.out.println(so1 + "<" + so2);
        }else {
            System.out.println("hai so bang nhau:");
        }
        scanner.close();
    }
}