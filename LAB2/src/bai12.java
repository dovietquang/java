import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so cot:");
        m = sc.nextInt();
        System.out.println("Nhap so hang:");
        n = sc.nextInt();
        int A[][] = new int[m][n];
        System.out.println("Nhap cac phan tu cua ma tran:");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.println("Nhap phan tu thu ["+i+","+j+"]:");
                A[i][j] = sc.nextInt();
            }
        }
        int max = A[0][0];
        for (int i = 0; i< m; i++){
            for (int j = 0; j < n; j++){
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
            sc.close();
        }System.out.println("Phan tu lon nhat trong ma tran la:" + max);
    }
}
