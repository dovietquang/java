import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi ky tu:");
        String chuoi = sc.nextLine();
        int so = 0, kytuthuong = 0, kytuhoa = 0;
        for(int i = 0;i < chuoi.length(); i++){
            if (chuoi.charAt(i) >= 97 && chuoi.charAt(i) <= 122) {
                ++kytuthuong    
            }else if (chuoi.charAt(i) >= 65 && chuoi.charAt(i) <= 90) {
                ++kytuhoa;
            }else if (chuoi.charAt(i) >= 48 && chuoi.charAt(i) <= 57) {
                ++so
            }else if (chuoi.charAt(i) > 122) {
                System.out.println("Chuoi co ky tu khong xac dinh");
            }
        }
        System.out.println("So ky tu viet thuong trong chuoi la :"+kytuthuong);
        System.out.println("So ki tu viet hoa trong chuoi la :"+kytuhoa);
        System.out.println("So ky tu chu so trong chuoi la :"+so);
        sc.close();
    }
}
