import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if(map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            }else {
                map.put(s, 1);
            }
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            String s = sc.next();
            if(map.containsKey(s)) {
                map.put(s, map.get(s) - 1);
            }else {
                map.put(s, -1);
            }
        }
        int max = Collections.max(map.values());
        if(max > 0) System.out.println(max);
        else System.out.println(0);
    }
}