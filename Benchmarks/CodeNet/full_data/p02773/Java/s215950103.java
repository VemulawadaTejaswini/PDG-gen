import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC155C - Poll

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] s = new String[n];
        int max = 1;
        HashMap<String, Integer> map = new HashMap();
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            if (map.containsKey(s[i])) {
                int v = map.get(s[i]) + 1;
                map.put(s[i], v);
                if (v > max) max = v;
            } else {
                map.put(s[i], 1);
            }
        }

        Arrays.sort(s);

        for (int i = 0; i < n; i++) {
            int v = map.get(s[i]);
            if (v == max) {
                System.out.println(s[i]);
            }
            i += (v - 1);
        }

    }
}