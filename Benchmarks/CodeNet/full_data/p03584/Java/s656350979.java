import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int K;
    static Entry[] E;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        E = new Entry[N];
        for (int i = 0; i < N; i++) {
            E[i] = new Entry(sc.nextInt(), sc.nextInt());
        }

        System.out.println( solve() );
    }

    static long solve() {
        if( K == 0 ) return solve0();

        List<Integer> candidates = calcCandidates();
        long[] sums = new long[candidates.size()];

        for (Entry e : E) {
            for (int i = 0; i < candidates.size(); i++) {
                int c = candidates.get(i);
                if( (c | e.a) == c ) {
                    sums[i] += e.b;
                }
            }
        }

        long ans = 0;
        for (long sum : sums) {
            ans = Math.max(sum, ans);
        }
        return ans;
    }

    static List<Integer> calcCandidates() {
        // 101100 -> [101100, 11111, 100111, 100011]
        List<Integer> candidates = new ArrayList<>();
        candidates.add(K);

        String s = Integer.toBinaryString(K);
        for (int i = 0; i < s.length(); i++) {
            if( s.charAt(i) == '1' ) {
                char[] chars = s.toCharArray();
                chars[i] = '0';
                for (int j = i+1; j < chars.length; j++) {
                    chars[j] = '1';
                }
                candidates.add( Integer.parseInt(new String(chars), 2) );
            }
        }
        return candidates;
    }

    static long solve0() {
        long sum = 0;
        for (Entry e : E) {
            if( e.a == 0 ) sum += e.b;
        }
        return sum;
    }

    static class Entry {
        int a;
        int b;

        public Entry(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    static class FastScanner {

        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
