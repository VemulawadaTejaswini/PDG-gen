import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ball = new int[n];
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < n; i++) {
            ball[i] = sc.nextInt();
            if (map.containsKey(ball[i])) {
                int b = map.get(ball[i]) + 1;
                map.replace(ball[i], b);
            } else {
                map.put(ball[i], 1);
            }
        }
        int sum = 0;
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            int k = (int) entry.getKey();
            int v = (int) entry.getValue();
            sum += v * (v - 1) / 2;
        }

        for (int i = 0; i < n; i++) {
            int t = map.get(ball[i]);
            int r = sum - t + 1;
            System.out.println(r);
        }
    }
}