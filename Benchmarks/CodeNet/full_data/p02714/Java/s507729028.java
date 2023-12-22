/*
 *created by Kraken on 12-04-2020 at 17:13
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        String s = sc.next();
        long res = 0;
        long[][] cnt = new long[n][3];
        Map<Character, Integer> idx = new HashMap<>();
        idx.put('R', 0); idx.put('G', 1); idx.put('B', 2);
        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1) {
                cnt[i][0] = cnt[i + 1][0];
                cnt[i][1] = cnt[i + 1][1];
                cnt[i][2] = cnt[i + 1][2];
            }
            cnt[i][idx.get(s.charAt(i))]++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) continue;
                if (s.charAt(i) == 'R' && s.charAt(j) == 'B') {
                    if (j < n - 1) res += cnt[j + 1][1];
                    if (j + (j - i) < n && s.charAt(j + (j - i)) == 'G') res--;
                } else if (s.charAt(i) == 'R' && s.charAt(j) == 'G') {
                    if (j < n - 1) res += cnt[j + 1][2];
                    if (j + (j - i) < n && s.charAt(j + (j - i)) == 'B') res--;
                } else if (s.charAt(i) == 'B' && s.charAt(j) == 'R') {
                    if (j < n - 1) res += cnt[j + 1][1];
                    if (j + (j - i) < n && s.charAt(j + (j - i)) == 'G') res--;
                } else if (s.charAt(i) == 'B' && s.charAt(j) == 'G') {
                    if (j < n - 1) res += cnt[j + 1][0];
                    if (j + (j - i) < n && s.charAt(j + (j - i)) == 'R') res--;
                } else if (s.charAt(i) == 'G' && s.charAt(j) == 'R') {
                    if (j < n - 1) res += cnt[j + 1][2];
                    if (j + (j - i) < n && s.charAt(j + (j - i)) == 'B') res--;
                } else if (s.charAt(i) == 'G' && s.charAt(j) == 'B') {
                    if (j < n - 1) res += cnt[j + 1][0];
                    if (j + (j - i) < n && s.charAt(j + (j - i)) == 'R') res--;
                }
            }
        }

        System.out.println(res);
    }

    static class FastReader {

        BufferedReader br;

        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
