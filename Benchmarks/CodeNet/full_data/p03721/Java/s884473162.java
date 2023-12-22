import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] vals = reader.readLine().split(" ");
        int N = Integer.parseInt(vals[0]);
        int K = Integer.parseInt(vals[1]);
        Map<Integer, Long> map = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            vals = reader.readLine().split(" ");
            int a = Integer.parseInt(vals[0]);
            int b = Integer.parseInt(vals[1]);
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + b);
            } else {
                map.put(a, (long) b);
            }
        }
        for (int key : map.keySet()) {
            long num = map.get(key);
            if (num >= K) {
                System.out.println(key);
                return;
            } else {
                K -= num;
            }
        }
    }
}
