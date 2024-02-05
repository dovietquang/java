import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cuamang:");
        int n = sc.nextInt();
        int [] mang = new int[n];
        for(int i = 0; i < mang.length; i++){
            System.out.println("Nhap phan tu thu " +(i+1) +":");
            mang [i] = sc.nextInt();
        }
        System.out.println("Mang truoc khi sap xep la");
        for(int = 0; i < mang.length; i++){
            System.out.println(mang[i]"");
        }
        for(int i = 0; i < mang.length; i++){
            for(int j = i + 1; j < mang.length; j++){
                if (mang[i] > mang[j]) {
                    int temp = mang[i];
                    mang[i] = mang [j];
                    mang[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Mang sau khi sap xep tang dan la:");
        for(int i = 0; i < mang.length; i++){
            System.out.println(mang[i]+"");
        }sc.close();
    }
}
