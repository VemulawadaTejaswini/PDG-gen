import java.util.*;

public class Main{
  
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();

        int[] w = new int[N];
        int[] v = new int[N];
        for (int i = 0; i < N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        long res = knapSack1(W, w, v, N, 0, new HashMap<>());
        System.out.println(res);

    }

    private static long knapSack1(int remW, int[] w, int[] v, int n, int i, Map<String, Long> map) {
        if (i >= n || remW <= 0) {
            return 0;
        }

        String key = n - i - 1 + "," + remW;

        if(map.containsKey(key)) {
            return map.get(key);
        }

        long maxValue;

        if(remW < w[i]) {
            maxValue = knapSack1(remW, w, v, n, i+1, map);
        } else {
            maxValue = Math.max(v[i] + knapSack1(remW - w[i], w, v, n, i+1, map),
                    knapSack1(remW, w, v, n, i+1, map));
        }
        map.put(key, maxValue);
        return maxValue;
    }

}