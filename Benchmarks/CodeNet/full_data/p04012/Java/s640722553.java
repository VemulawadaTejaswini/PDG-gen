import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String[] ary = n.split("");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n.length(); i++) {
            if (map.containsKey(ary[i])) {
                map.put(ary[i], map.get(ary[i]) + 1);
            } else {
                map.put(ary[i], 1);
            }
        }
        for (int cnt : map.values()) {
            if (cnt % 2 != 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}