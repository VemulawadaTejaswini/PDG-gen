import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextInt();
        long[] a = new long[n];
        long[] sum = new long[n+1];
        Map<Integer, Integer> map = new HashMap<>();
        long res = 0;
        map.put(0, 1);
        for(int i=0; i<n; i++) {
            a[i] = (sc.nextLong() + k - 1) % k;
            sum[i+1] = (sum[i] + a[i]) % k;
            int key = (int) sum[i+1];
            if(i-k+1 >= 0) {
                int k2 = (int)sum[(int)(i-k+1)];
                map.put(k2, map.get(k2)-1);
            }
            int count = map.getOrDefault(key, 0);
            res += count;
            map.put(key, count+1);
        }
        System.out.println(res);

    }

}
