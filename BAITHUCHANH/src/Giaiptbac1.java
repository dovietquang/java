import java.util.Scanner;
public class Giaiptbac1 {
    public static void main(String[] args) {
        double a,b;
        Scanner scanner = new Scanner(system.in);
        System.out.print("Nhap a: ");
        a = scanner.nextDouble();
       System.out.print("Nhap b: ");
        b = scanner.nextDouble();
       if (a == 0) {
           if (b == 0) {
               System.out.println("Phuong trinh co vo so nghiem");
           } else {
               System.out.println("Phuong trinh vo nghiem");
           }
       } else {
           double x = -b / a;
           System.out.println("Nghiem cua phuong trinh la: x = " +x);
       }
       scanner.close();
   }
}
    }
}