import java.io.*;
import java.util.*;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static class Enemy {
        private long x;
        private long health;

        private Enemy(int x, int health) {
            this.x = x;
            this.health = health;
        }
    }

    private static void solve() {
        long n = in.nextInt();
        long d = in.nextInt();
        long a = in.nextInt();

        List<Enemy> enemies = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int h = in.nextInt();
            enemies.add(new Enemy(x, h));
        }

        enemies.sort(Comparator.comparingLong(e -> e.x));

        long ans = 0;
        while (true) {
            int min = -1;
            for (int i = 0; i < enemies.size(); i++) {
                Enemy enemy = enemies.get(i);
                if (enemy.health > 0) {
                    min = i;
                    break;
                }
            }
            if (min == -1) break;

            long maxX = enemies.get(min).x + 2 * d;
            int maxIndex = enemies.size();
            for (int i = min; i < enemies.size(); i++) {
                Enemy enemy = enemies.get(i);
                if (enemy.x > maxX) {
                    maxIndex = i;
                    break;
                }
            }

            long bombsToDrop = enemies.get(min).health / a + ((enemies.get(min).health % a == 0) ? 0 : 1);
            ans += bombsToDrop;
            long damage = bombsToDrop * a;
            for (int i = min; i < maxIndex; i++) {
                enemies.get(i).health -= damage;
            }
        }

        out.println(ans);
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
