import java.util.ArrayList;

public class Slide18Lab4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        arrListInteger.add(0);
        arrListInteger.add(7);
        arrListInteger.add(1);
        arrListInteger.add(9);
        System.out.println("Cac phan tu co trong arrListInterger la:");
        for (int number : arrListInteger){
            System.out.println(number + "\t");
        }
    }
}
