import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main (String[] args) {

        Map<String, Integer> ms = new HashMap<String, Integer>();
        Map<String, Integer> mt = new HashMap<String, Integer>();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            ms.put(s, (ms.containsKey(s)? ms.get(s)+1 : 1));
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            String t = sc.next();
            mt.put(t, (mt.containsKey(t)? mt.get(t)+1 : 1));
        }

        int ans = 0;
        for (String s : ms.keySet()) {
            int plus = ms.get(s);
            int minus = (mt.containsKey(s)? mt.get(s) : 0);

            ans = Math.max(ans, plus - minus);
        }
        System.out.println(ans);
    }
}