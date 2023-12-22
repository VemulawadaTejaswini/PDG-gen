
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s  = new String[n];
        for (int i = 0 ; i < n ; i++) {
            s[i] = sc.next();
        }

        String[] t = new String[n];
        for (int i = 0 ; i < n ; i++) {
            char[] d = new char[10];
            for (int j = 0 ; j < 10 ; j++) {
                d[j] = s[i].charAt(j);
            }
            Arrays.sort(d);
            StringBuilder sBuilder = new StringBuilder();
            for (int j = 0 ; j < 10 ; j++ ) {
                sBuilder.append(d[j]);
            }
            t[i] = sBuilder.toString();
        }

        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0 ; i < n ; i++) {
            if (map.containsKey(t[i])) {
                map.put(t[i], map.get(t[i]) + 1);
            } else {
                map.put(t[i], 1);
            }
        }
        long ans = 0;
        for (Entry<String, Integer> entry : map.entrySet()) {
            int v = entry.getValue();
            ans += (long) v * (v - 1) / 2;
        }

        System.out.println(ans);

    }

}
