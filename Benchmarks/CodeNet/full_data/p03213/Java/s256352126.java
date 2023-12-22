import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.HashMap;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FasterScanner in = new FasterScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FasterScanner in, PrintWriter out) {
            int n = in.nextInt();

            List<Integer> pn = Numbers.generatePrimeNumbers(100);

            HashMap<Integer, Integer> pnc = new HashMap<>();

            for (int i = 1; i <= n; i++) {
                int cn = i;
                for (int j = 0; j < pnc.size() || cn > 1; j++) {
                    int cp = pn.get(j);
                    while (cn % cp == 0) {
                        cn /= cp;
                        pnc.put(cp, pnc.getOrDefault(cp, 0) + 1);
                    }
                }
            }

            int ans = 0;
            // 1 75(74)
            for (int cp1 : pnc.keySet()) {
                int cn1 = pnc.get(cp1);
                if (cn1 >= 74) {
                    ans += 1;
                }
            }
            // 3 25(2, 24)
            for (int cp1 : pnc.keySet()) {
                int cn1 = pnc.get(cp1);
                if (cn1 >= 24) {
                    for (int cp2 : pnc.keySet()) {
                        if (cp2 == cp1) continue;
                        int cn2 = pnc.get(cp2);
                        if (cn2 >= 2) {
                            ans++;
                        }
                    }
                }
            }
            // 5 15(4, 14)
            for (int cp1 : pnc.keySet()) {
                int cn1 = pnc.get(cp1);
                if (cn1 >= 14) {
                    for (int cp2 : pnc.keySet()) {
                        if (cp2 == cp1) continue;
                        int cn2 = pnc.get(cp2);
                        if (cn2 >= 4) {
                            ans++;
                        }
                    }
                }
            }
            // 3 5 5(2, 4, 4)
            for (int cp1 : pnc.keySet()) {
                int cn1 = pnc.get(cp1);
                if (cn1 >= 2) {
                    int fc = 0;
                    for (int cp2 : pnc.keySet()) {
                        if (cp2 == cp1) continue;
                        int cn2 = pnc.get(cp2);
                        if (cn2 >= 4) {
                            fc++;
                        }
                    }
                    if (fc >= 2) ans += fc * (fc - 1) / 2;
                }
            }

            out.println(ans);
        }

    }

    static class Numbers {
        public static List<Integer> generatePrimeNumbers(int max) {
            boolean[] isPrime = new boolean[max + 1];
            for (int i = 2; i <= max; i++) isPrime[i] = true;

            int sqrtMax = (int) Math.sqrt(max);
            for (int i = 2; i < sqrtMax; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j <= max; j += i) {
                        isPrime[j] = false;
                    }
                }
            }

            ArrayList<Integer> primeNumbers = new ArrayList<>();
            for (int i = 2; i <= max; i++) if (isPrime[i]) primeNumbers.add(i);

            return primeNumbers;
        }

    }

    static class FasterScanner {
        private InputStream in;
        private byte[] buffer;
        private int bufPointer;
        private int bufLength;

        public FasterScanner(InputStream in) {
            this.in = in;
            buffer = new byte[1024];
        }

        private boolean hasNextByte() {
            if (bufPointer < bufLength) return true;
            bufPointer = 0;
            try {
                bufLength = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return (bufLength > 0);
        }

        private int readByte() {
            if (hasNextByte()) return buffer[bufPointer++];
            return -1;
        }

        private static boolean isPrintableChar(int c) {
            return (c >= 33 && c <= 126);
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[bufPointer])) bufPointer++;
            return hasNextByte();
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || b > '9') throw new NumberFormatException();

            while (true) {
                if (b >= '0' && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

    }
}

