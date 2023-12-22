
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();

        int n  = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            int value = map.getOrDefault(word, 0);
            value ++;
            map.put(word, value);
        }

        int m  = sc.nextInt();
        for (int i = 0; i < m; i++) {
            String word = sc.next();
            int value = map.getOrDefault(word, 0);
            value--;
            map.put(word, value);
        }

        int max = 0; //Integer.MIN_VALUE;
        //String maxWord = "";
        for (Map.Entry<String, Integer> entry:  map.entrySet()) {
            int entryVal = entry.getValue();
            if (entryVal > max) {
                max = entryVal;
                //maxWord = entry.getKey();
            }
        }
        System.out.println(max);
    }
}