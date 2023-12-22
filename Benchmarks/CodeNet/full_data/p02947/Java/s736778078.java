/**
 * @author derrick20
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = sc.nextInt();
        HashMap<String, Integer> seen = new HashMap<>();
        long total = 0;
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            int[] cts = new int[26];
            for (char c : s.toCharArray()) {
                cts[c - 'a']++;
            }
            StringBuilder hash = new StringBuilder();
            for (int val : cts) {
                hash.append(val + "_");
            }
            String key = hash.toString();
            if (seen.containsKey(key)) {
                total += seen.get(key);
                seen.put(key, seen.get(key) + 1);
            }
            else {
                seen.put(key, 1);
            }
        }
        out.println(total);
        out.close();
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        FastScanner(FileReader s) {
            br = new BufferedReader(s);
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        String nextLine() throws IOException { return br.readLine(); }

        double nextDouble() throws IOException { return Double.parseDouble(next()); }

        int nextInt() throws IOException { return Integer.parseInt(next()); }

        long nextLong() throws IOException { return Long.parseLong(next()); }
    }
}