// package arc.arc103;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static long __startTime = System.currentTimeMillis();

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        long[][] d = new long[n][2];
        for (int i = 0; i < n ; i++) {
            d[i][0] = in.nextLong();
            d[i][1] = i;
        }
        Arrays.sort(d, (u, v) -> Long.compare(v[0], u[0]));

        List<int[]> tree = new ArrayList<>();

        Map<Long,List<int[]>> roots = new TreeMap<>();
        for (int i = 0; i < n-1 ; i++) {
            long value = d[i][0];
            int id = (int)d[i][1];

            long nv = value-(n-2);
            int totalN = 1;
            if (roots.size() == 0 || !roots.containsKey(value)) {
            } else {
                for (int[] px : roots.get(value)) {
                    tree.add(new int[]{id, px[0]});
                    totalN += px[1];
                }
                nv = value-(n-(totalN+1));
                roots.remove(value);
            }

            if (roots.containsKey(nv)) {
                roots.get(value).add(new int[]{id, totalN});
            } else {
                List<int[]> x = new ArrayList<>();
                x.add(new int[]{id, totalN});
                roots.put(nv, x);
            }

        }

        if (roots.size() >= 2) {
            out.println(-1);
        } else {
            int lid = (int)d[n-1][1];
            for (long lk : roots.keySet()) {
                if (d[n-1][0] != lk) {
                    out.println(-1);
                    out.flush();
                    return;
                }
                for (int[] w : roots.get(lk)) {
                    tree.add(new int[]{lid, w[0]});
                }
            }
            for (int[] e : tree) {
                out.println(String.format("%d %d", e[0]+1, e[1]+1));
            }
        }
        out.flush();
    }

    private static List<int[]> solve(char[] s) {
        int n = s.length-1;
        if (s[n] == '1') {
            return null;
        }
        if (s[1] == '0') {
            return null;
        }

        for (int i = 1 ; i <= n-1 ; i++) {
            if (s[i] != s[n-i]) {
                return null;
            }
        }

        List<int[]> tree = new ArrayList<>();
        int lcnt = 0;
        for (int i = 1 ; i <= n-1 ; i++) {
            lcnt += s[i]-'0';
        }
        if (lcnt == n-1) {
            for (int i = 0; i < n-1; i++) {
                tree.add(new int[]{i, i+1});
            }
            return tree;
        }

        if (lcnt == 2) {
            for (int i = 1 ; i <= n-1; i++) {
                tree.add(new int[]{0, i});
            }
            return tree;
        }

        // 12345678
        // 10101010

        int last = 0;
        int rt = -1;
        for (int v = 2 ; v <= n/2 ; v++) {
            if (s[v] == '1') {
                int diff = v - last;
                int nroot = getId(1)[0];
                if (rt != -1) {
                    tree.add(new int[]{rt, nroot});
                }
                if (diff >= 2) {
                    int[] ww = getId(diff-1);
                    for (int i = 0; i < ww.length; i++) {
                        tree.add(new int[]{nroot, ww[i]});
                    }
                }
                last = v;
                rt = nroot;

                debug(v, rt, last);
            }
        }

        int nrt = getId(1)[0];
        tree.add(new int[]{rt, nrt});
        rt = nrt;

        while (true) {
            int nid = getId(1)[0];
            if (nid >= n) {
                break;
            }
            tree.add(new int[]{rt, nid});
        }
        for (int i = 0; i < n ; i++) {
            
        }
        
        return tree;
    }


    static int nid = 0;
    static int[] getId(int want) {
        int[] w = new int[want];
        for (int i = 0; i < want ; i++) {
            w[i] = nid++;
        }
        return w;
    }

    private static void printTime(String label) {
        debug(label, System.currentTimeMillis() - __startTime);
    }

    private static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }

    public static class InputReader {
        private static final int BUFFER_LENGTH = 1 << 12;
        private InputStream stream;
        private byte[] buf = new byte[BUFFER_LENGTH];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int next() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public char nextChar() {
            return (char) skipWhileSpace();
        }

        public String nextToken() {
            int c = skipWhileSpace();
            StringBuilder res = new StringBuilder();
            do {
                res.append((char) c);
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public long nextLong() {
            int c = skipWhileSpace();
            long sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = next();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            return Double.valueOf(nextToken());
        }

        int skipWhileSpace() {
            int c = next();
            while (isSpaceChar(c)) {
                c = next();
            }
            return c;
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
}