import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide89Lab4 {
    public static void main(String[] args) {
        HashMap<String,String> hashMapCity = new HashMap<>();
        hashMapCity.put("QNG" , "Quang Ngai");
        hashMapCity.put("QN" , "Quang Nam");
        hashMapCity.put("QN" , "Quang Ninh");
        hashMapCity.put("HCM" , "Thanh Pho Ho Chi Minh");
        System.out.println("Danh sach cac thanh pho trong hashMapCity: ");
        Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet();
        System.out.println(setCity);
        System.out.println("QNG: " + hashMapCity.get("QNG"));
        System.out.println("NT: " + hashMapCity.get("NT"));
        if (hashMapCity.containsValue("Thanh Pho Ho Chi Minh")) {
            System.out.println("Co Thanh Pho Ho Chi Minh trong hashMapCity");
        }
        }
    }
