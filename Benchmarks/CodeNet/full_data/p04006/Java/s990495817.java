
import java.io.*;
import java.util.*;


/**
 * Created by Katushka on 11.03.2020.
 */
public class Main {

    static Integer[] readArray(int size, InputReader in) {
        Integer[] a = new Integer[size];
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

    static void sortArray(int[] a) {
        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            int randomPos = random.nextInt(a.length);
            int t = a[i];
            a[i] = a[randomPos];
            a[randomPos] = t;
        }
        Arrays.sort(a);
    }

    public static void main(String[] args) throws FileNotFoundException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = in.nextInt();
        long x = in.nextLong();

        long[] a = readLongArray(n, in);
        long min = Long.MAX_VALUE;
        for (long ai : a) {
            min = Math.min(ai, min);
        }
        List<Integer> mins = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (a[i] <= min + x) {
                mins.add(i);
            }
        }
        if (mins.size() == n) {
            long ans = 0;
            for (long ai : a) {
                ans += ai;
            }
            out.println(ans);
        } else {
            List<Integer> minsDoubled = new ArrayList<>(mins);
            for (int i = 0; i < mins.size(); i++) {
                minsDoubled.add(mins.get(i) + n);
            }

            int maxDist = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] > min + x) {
                    int ind = -Collections.binarySearch(minsDoubled, i + n) - 2;
                    maxDist = Math.max(maxDist, (i - minsDoubled.get(ind) + n) % n);
                }
            }

            long ans = ((long) maxDist) * x;
            for (int i = 0; i < n; i++) {
                if (a[i] > min) {
                    int ind = Collections.binarySearch(minsDoubled, i + n);
                    if (ind < 0) {
                        ind = -ind - 2;
                    }
                    ind = (ind % mins.size()) + mins.size();
                    long minPossible = Long.MAX_VALUE;
                    while (ind >= 0 && minsDoubled.get(ind) >= i + n - maxDist) {
                        minPossible = Math.min(minPossible, a[minsDoubled.get(ind) % n]);
                        ind--;
                    }
                    ans += minPossible;
                } else {
                    ans += a[i];
                }
            }
            out.println(ans);

        }
        out.close();
    }


    private static void outputArray(long[] ans, PrintWriter out) {
        StringBuilder str = new StringBuilder();
        for (long an : ans) {
            str.append(an).append(" ");
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