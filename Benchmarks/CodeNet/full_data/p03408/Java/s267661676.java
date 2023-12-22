import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        String[] ss = new String[n];
        HashMap<String, Integer> sMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String key = sc.next();
            sMap.put(key, sMap.getOrDefault(key, 0) + 1);
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            String key = sc.next();
            sMap.put(key, sMap.getOrDefault(key, 0) - 1);
        }
        int max = Collections.max(sMap.values());
        System.out.println(Math.max(max, 0));
    }
}