import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        List<Map<Integer, Integer>> kk = new ArrayList<Map<Integer,Integer>>();
        Map<Integer, Integer> num = new HashMap<>();
        for (int i = 0 ; i < n ; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            int b = a[i];
            for (int j = 2 ; j <= Math.sqrt(a[i]) ; j++) {
                while (b % j == 0) {
                    if (map.containsKey(j)) {
                        map.put(j, map.get(j) + 1);
                    } else {
                        map.put(j, 1);
                    }
                    b /= j;
                }
            }
            if (b != 1) {
                map.put(b, 1);
            }

            for (Entry<Integer, Integer> entry : map.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();
                if (num.containsKey(key)) {
                    num.put(key, Math.max(value, num.get(key)));
                } else {
                    num.put(key, value);
                }
            }
            kk.add(map);
        }
        long ans = 0;
        long mod = 1000000007;
        for (int i = 0 ; i < n ; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            long z = 1l;

            for (Entry<Integer, Integer> entry : num.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();

                if (kk.get(i).containsKey(key)) {
                    z *= Math.pow(key, value - kk.get(i).get(key)) % mod;
                    z %= mod;
                } else {
                    z *= Math.pow(key, value) % mod;
                    z %= mod;
                }
            }
            ans += z % mod;
        }

        System.out.println(ans % mod);

    }

}