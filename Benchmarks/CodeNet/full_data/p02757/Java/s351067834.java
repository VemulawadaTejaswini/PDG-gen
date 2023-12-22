import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ", 2);
        int n = Integer.parseInt(first[0]);
        int p = Integer.parseInt(first[1]);
        char[] arr = br.readLine().toCharArray();
        HashMap<Integer, Integer> prev = new HashMap<>();
        HashMap<Integer, Integer> next = new HashMap<>();
        long count = 0;
        for (int i = 1; i <= n; i++) {
            int x = arr[i - 1] - '0';
            for (Map.Entry<Integer, Integer> entry : prev.entrySet()) {
                int y = (entry.getKey() * 10 + x) % p;
                if (next.containsKey(y)) {
                    next.put(y, next.get(y) + entry.getValue());
                } else {
                    next.put(y, entry.getValue());
                }
            }
            int z = x % p;
            if (next.containsKey(z)) {
                next.put(z, next.get(z) + 1);
            } else {
                next.put(z, 1);
            }
            if (next.containsKey(0)) {
                count += next.get(0);
            }
            HashMap<Integer, Integer> tmp = next;
            next = prev;
            prev = tmp;
            next.clear();
        }
        System.out.println(count);
    }
}
