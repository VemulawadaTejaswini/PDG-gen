import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] vals = reader.readLine().split(" ");
        long N = Long.parseLong(vals[0]);
        long K = Long.parseLong(vals[1]);
        Map<Long, Long> map = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            vals = reader.readLine().split(" ");
            long a = Long.parseLong(vals[0]);
            long b = Long.parseLong(vals[1]);
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + b);
            } else {
                map.put(a, (long) b);
            }
        }
        for (long key : map.keySet()) {
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
