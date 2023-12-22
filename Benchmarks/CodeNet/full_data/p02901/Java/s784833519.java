import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
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
        int n = in.nextInt(); // chests
        int m = in.nextInt(); // keys
        List<Key> keys = new ArrayList<>();
        for (int i=0; i < m; i++) {
            int keyPrice = in.nextInt();
            int b = in.nextInt();
            int[] cap = new int[b];
            for (int j=0; j < b; j++) {
                cap[j] = in.nextInt() - 1; // 0-indexed
            }
            Key key = new Key(keyPrice, cap);
            keys.add(key);
        }

        keys.sort((Comparator.comparingInt(o -> o.price)));

        // keys.forEach(key -> out.println(key.toString()));

        int[] caps = new int[n]; // key capabilities
        List<Integer> chosenKeys = new ArrayList<>();
        boolean flag = false;
        for (int i = 0; i < keys.size(); i++) {
            Key key = keys.get(i);
            for (int c : key.cap) {
                caps[c]++;
            }
            chosenKeys.add(i);
            // check removable keys
            for (int j = i; j >= 0; j--) {
                if (!chosenKeys.contains(new Integer(j)))
                    continue;
                if (isRemovable(keys.get(j), caps)) {
                    // Remove key
                    chosenKeys.remove(new Integer(j));
                    for (int c : keys.get(j).cap) {
                        caps[c]--;
                    }
                }
            }
            if (check(caps)) {
                flag = true;
                break;
            }
        }

        // out.println("Chosen keys: " + chosenKeys);
        long ans = chosenKeys.stream().mapToInt(i -> keys.get(i).price).sum();
        out.println(flag ? ans : -1);
    }

    private static boolean isRemovable(Key key, int[] caps) {
        for (int c : key.cap) {
            if (caps[c] < 2)
                return false;
        }
        return true;
    }

    private static boolean check(int[] caps) {
        for (int each : caps) {
            if (each == 0)
                return false;
        }
        return true;
    }

    private static class Key {
        private int price;
        private int[] cap;

        private Key(int price, int[] cap) {
            this.price = price;
            this.cap = cap;
        }

        @Override
        public String toString() {
            return price + " " + Arrays.toString(cap);
        }
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream inputStream) {
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
