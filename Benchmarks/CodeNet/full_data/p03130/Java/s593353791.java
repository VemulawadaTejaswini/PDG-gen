import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Map<Integer, Integer> map = new HashMap<>();
        int a;
        int b;
        for (int i = 0; i < 3; i += 1) {
            a = sc.nextInt();
            b = sc.nextInt();
            
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
            if (map.containsKey(b)) {
                map.put(b, map.get(b) + 1);
            } else {
                map.put(b, 1);
            }
        }
        
        if (map.containsValue(3)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }

}
