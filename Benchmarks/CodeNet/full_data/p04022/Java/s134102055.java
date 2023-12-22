import java.io.*;
import java.util.*;

/**
 * Created by Katushka on 11.03.2020.
 */
public class Main {

    static int[] readArray(int size, InputReader in) {
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextInt();
        }
        return a;
    }

    static long[] readLongArray(int size, InputReader in) {
        long[] a = new long[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextLong();
        }
        return a;
    }

    private static long fastPow(long x, long y, long mod) {
        if (x == 1) {
            return 1;
        }
        if (y == 0) {
            return 1;
        }
        long p = fastPow(x, y / 2, mod) % mod;
        p = p * p % mod;
        if (y % 2 == 1) {
            p = p * x % mod;
        }
        return p;
    }


    static int[] sieveOfEuler(int size, List<Integer> primes) {
        int[] lp = new int[size];

        lp[1] = 1;

        for (int j = 2; j < lp.length; ++j) {
            if (lp[j] == 0) {
                lp[j] = j;
                primes.add(j);
            }
            for (Integer p : primes) {
                if (p > lp[j] || p * j >= size) {
                    break;
                }
                lp[p * j] = p;
            }
        }
        return lp;
    }

    public static void main(String[] args) throws FileNotFoundException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = in.nextInt();
        long[] s = readLongArray(n, in);
        long max = 0;
        for (long l : s) {
            max = Math.max(l, max);
        }

        Map<Long, Long> nonCube2cnt = new HashMap<>();
        Map<Long, Long> pairs = new HashMap<>();

        ArrayList<Integer> primes = new ArrayList<>();
        sieveOfEuler(1000000, primes);

        int cubesCnt = 0;
        long ans = 0;
        outer:
        for (int i = 0; i < n; i++) {
            long ss = s[i];
            int j = 0;
            long d = primes.get(j);
            long nonCube = 1;
            long peer = 1;
            while (d * d * d <= s[i]) {
                int cnt = 0;
                while (ss % d == 0) {
                    ss /= d;
                    cnt += 1;
                }
                cnt %= 3;
                if (cnt == 1) {
                    nonCube *= d;
                    peer *= d * d;
                } else if (cnt == 2) {
                    nonCube *= d * d;
                    peer *= d;
                }
                if (peer > max) {
                    ans += 1;
                    continue outer;
                }
                j++;
                d = primes.get(j);
            }

            if (ss > 1) {
                if (ss > 1000000) {
                    ans += 1;
                    continue;
                }
                nonCube *= ss;

                long sqrt = (long) Math.floor(Math.sqrt(ss));
                if (sqrt * sqrt == ss) {
                    peer *= sqrt;
                } else {
                    peer *= ss * ss;
                }

                if (peer > max) {
                    ans += 1;
                    continue;
                }
            }

            if (nonCube == 1) {
                cubesCnt++;
            } else {
                nonCube2cnt.put(nonCube, nonCube2cnt.getOrDefault(nonCube, 0L) + 1);
                pairs.put(nonCube, peer);
                pairs.put(peer, nonCube);
            }
        }

        ans += cubesCnt > 0 ? 1 : 0;
        for (Long aLong : nonCube2cnt.keySet()) {
            if (pairs.containsKey(aLong)) {
                long cnt1 = nonCube2cnt.get(aLong);
                Long peer = pairs.get(aLong);
                long cnt2 = nonCube2cnt.getOrDefault(peer, 0L);
                if (Math.max(cnt1, cnt2) > 1) {
                    ans += Math.max(cnt1, cnt2);
                } else {
                    ans += 1;
                }
                pairs.remove(aLong);
                pairs.remove(peer);
            }
        }
        out.println(ans);


        out.close();
    }


    private static void outputArray(long[] ans, PrintWriter out) {
        StringBuilder str = new StringBuilder();
        for (long an : ans) {
            str.append(an).append(' ');
        }
        out.println(str);
    }

    private static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                createTokenizer();
            }
            return tokenizer.nextToken();
        }

        private void createTokenizer() {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public String nextWord() {
            return next();
        }

        public String nextString() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public char nextChar() {
            return next().charAt(0);
        }

        public int[] nextInts() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                createTokenizer();
            }
            List<Integer> res = new ArrayList<>();
            while (tokenizer.hasMoreElements()) {
                res.add(Integer.parseInt(tokenizer.nextToken()));
            }
            int[] resArray = new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                resArray[i] = res.get(i);
            }
            return resArray;
        }
    }
}