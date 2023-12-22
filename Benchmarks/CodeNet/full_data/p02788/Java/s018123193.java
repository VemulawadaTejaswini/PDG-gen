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
        int min = 0;
        int max = 1;
        long[] hDiff = new long[(int)n+1];
        hDiff[0] = enemies.get(0).health;
        for (int i = 1; i < enemies.size(); i++) {
            hDiff[i] = enemies.get(i).health - enemies.get(i - 1).health;
        }
        long health = hDiff[0];
        while (true) {
            while (min < enemies.size()) {
                if (health <= 0) {
                    min++;
                    health += hDiff[min];
                } else {
                    break;
                }
            }
            if (min >= enemies.size()) break;

            long maxX = enemies.get(min).x + 2 * d;
            int maxIndex = findFirstXLargerThan(enemies, max, maxX);

            long bombsToDrop = health / a + ((health % a == 0) ? 0 : 1);
            ans += bombsToDrop;
            long damage = bombsToDrop * a;
            health -= damage;

            hDiff[min] -= damage;
            hDiff[maxIndex] += damage;

            min++;
            if (min >= enemies.size()) {
                break;
            }
            health += hDiff[min];
        }

        out.println(ans);
    }

    private static int findFirstXLargerThan(List<Enemy> enemies, int current, long maxX) {
        while (current < enemies.size()) {
            if (enemies.get(current).x <= maxX) {
                current++;
            } else {
                break;
            }
        }
        return current;
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
