import java.util.*;
import java.io.*;

//atcoder
public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out, false);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for(int i = 0; i < n; i++) arr[i] = scanner.nextLong();
        ArrayList<Long>[] lists = new ArrayList[62];
        int[] cnt = new int[62];
        for(int i = 0; i < n; i++) for(int j = 61; j >= 0; j--) if (((1L << j) & arr[i]) > 0) cnt[j]++;
        for(int i = 0; i < 62; i++) for(int j = 0; j < n; j++) if (cnt[i] % 2 == 1 && ((1L << i) & arr[j]) > 0) arr[j] ^= 1L << i;
        for(int i = 0; i < 62; i++) lists[i] = new ArrayList<>();
        for(int i = 0; i < n; i++) for(int j = 61; j >= 0; j--) if (((1L<<j) & arr[i]) > 0) {
            lists[j].add(arr[i]);
            break;
        }
        long ans = 0;
        for(int i = 0; i < 62; i++) if ( cnt[i] > 0 && cnt[i] % 2 == 1) ans |= (1L << i);
        long val = 0;
        for(int i = 61; i>= 0; i--) {
            if (!lists[i].isEmpty()) {
                Collections.sort(lists[i], Collections.reverseOrder());
                val = Math.max(val, val ^ lists[i].get(0));
                long t  = lists[i].get(0);
                for(int j = 1; j < lists[i].size(); j++) {
                    long cur = lists[i].get(j) ^ t;
                    for(int k = i - 1; k >= 0; k--) if (((1L << k) & cur) > 0) {
                        lists[k].add(cur);
                        break;
                    }
                }
            }
        }
        out.println((val * 2 + ans));
        out.flush();
    }
    
    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }
        public FastScanner() {
            this(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
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
    }
}
