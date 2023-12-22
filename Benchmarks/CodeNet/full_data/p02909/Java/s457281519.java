import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        HashMap<String, String> hashmap = new HashMap<String, String>();
        hashmap.put("Sunny", "Cloudy");
        hashmap.put("Cloudy", "Rainy");
        hashmap.put("Rainy", "Sunny");
        System.out.println(hashmap.get(S));
    }
}