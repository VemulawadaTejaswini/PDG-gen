import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        long[] b = new long[n];
        Map<Integer, Integer> map = new HashMap<>();

        long sum = 0;
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            sum += (long) a[i];
            b[i] = sum;
            int p = (int) (b[i] % m);
            if (map.containsKey(p)) {
               map.put(p, map.get(p) + 1);
            } else {
                map.put(p, 1);
            }


        }
        long ans = 0;
        map.put(0, map.get(0) + 1);
        for (Integer key : map.keySet()) {
            ans += (long) map.get(key) * (map.get(key) - 1) / 2;
           // System.out.println(key + "  " + map.get(key));
        }
        System.out.println(ans);
    }

}