import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Main {
    static class Pair implements Comparable<Pair> {
        int b;
        int c;

        Pair(int b, int c) {
            this.b = b;
            this.c = c;
        }

        @Override
        public int compareTo(Pair p) {
            return p.c - c;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);

        long[] sum = new long[n + 1];
        int[] a = new int[n];
        in = br.readLine().split(" ");
        for(int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(in[i]);
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + a[i];
        }

        long ans = sum[n];
        int x = 0;
        Pair[] pairs = new Pair[m];
        for(int i = 0; i < m; i++) {
            in = br.readLine().split(" ");
            int b = Integer.parseInt(in[0]);
            int c = Integer.parseInt(in[1]);
            pairs[i] = new Pair(b, c);
        }
        Arrays.sort(pairs);

        for(int i = 0; i < m; i++) {
            Pair p = pairs[i];
            p.b = Math.min(p.b, n - 1 - x);
            if(a[x] >= p.c) continue;
            if(a[x + p.b] > p.c) {
                int y = Arrays.binarySearch(a, p.c);
                int j = y > 0? y + 1 - x : ~y - x;
                System.out.println(j);
                ans += (long) j * p.c - (sum[x + j] - sum[x]);
                x += j;
            }else {
                ans += (long) p.b * p.c - (sum[x + p.b] - sum[x]);
                x += p.b;
            }
        }

        System.out.println(ans);

        br.close();
    }
}