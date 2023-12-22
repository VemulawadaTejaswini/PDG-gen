import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        char[] s = in.next().toCharArray();
        int q = in.nextInt();

        for (int i = 0; i < s.length; i++) {
            s[i] -= 'a';
        }

        PriorityQueue<Integer>[] charMap = new PriorityQueue[26];
        for (int i = 0; i < 26; i++) {
            charMap[i] = new PriorityQueue<>();
        }

        for (int i = 0; i < s.length; i++) {
            char c = s[i];
            charMap[c].add(i);
        }

        for (int i = 0; i < q; i++) {
            int type = in.nextInt();
            if (type == 1) {
                // type 1 query
                int place = in.nextInt() - 1;
                String replace = in.next();
                int old = s[place];
                int ch = replace.charAt(0) - 'a';
                charMap[old].remove(place);
                charMap[ch].add(place);
            } else {
                // type 2 query
                int l = in.nextInt() - 1;
                int r = in.nextInt();
                out.println(queryType2(charMap, l, r));
            }
        }
    }

    private static int queryType2(PriorityQueue<Integer>[] charMap, int l, int r) {
        int ret = 0;
        for (int i = 0; i < 26; i++) {
            Integer[] arr = charMap[i].toArray(new Integer[]{});
            int leftInsertion = Arrays.binarySearch(arr, l, Comparator.comparingInt(Integer::intValue));
            if (leftInsertion < 0) {
                leftInsertion = ~leftInsertion;
            }
            int rightInsertion = Arrays.binarySearch(arr, r, Comparator.comparingInt(Integer::intValue));
            if (rightInsertion < 0) {
                rightInsertion = ~rightInsertion;
            }
            if (leftInsertion < rightInsertion) {
                ret++;
            }
        }
        return ret;
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
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
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        // https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
