//package com.company;
// Always comment out package when submitting.
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static class Task {
        public class SegmentTree {
            int n;
            int[] val;
            int[] lazy;
            public SegmentTree(int n) {
                this.n = n;
                val = new int[4 * n];
                lazy = new int[4 * n];
            }
            public void build(int[] initialVal) {
//                System.arraycopy(initialVal, 0, val, 0, initialVal.length);
                build(initialVal, 0, n, 1);
            }
            public void build(int[] initialVal, int l, int r, int idx) {
                if (l == r - 1) {
                    val[idx] = initialVal[l];
                    return;
                }
                int mid = (l + r) >> 1;
                build(initialVal, l, mid, idx << 1);
                build(initialVal, mid, r, idx << 1 | 1);
                val[idx] = Math.max(val[idx << 1], val[idx << 1 | 1]);
            }
            public void push(int idx) {
                if ((idx << 1 | 1) < val.length) {
                    lazy[idx << 1] += lazy[idx];
                    lazy[idx << 1 | 1] += lazy[idx];
                    val[idx << 1] += lazy[idx];
                    val[idx << 1 | 1] += lazy[idx];
                    lazy[idx] = 0;
                }
            }
            public void addRange(int L, int R, int v) {
//                for (int i = L; i < R; i++) {
//                    val[i] += v;
//                }
                addRange(0, n, 1, L, R, v);
            }
            public void addRange(int l, int r, int idx, int L, int R, int v) {
                if (L <= l && r <= R) {
                    lazy[idx] += v;
                    val[idx] += v;
                    return;
                }
                if (L >= r || l >= R) return;
                push(idx);
                int mid = (l + r) >> 1;
                addRange(l, mid, idx << 1, L ,R, v);
                addRange(mid, r, idx << 1 | 1, L ,R, v);
                val[idx] = Math.max(val[idx << 1], val[idx << 1 | 1]);
            }
            public int query() {
//                int mx = 0;
//                for (int i = 0; i < n; i++) {
//                    mx = Math.max(mx, val[i]);
//                }
//                return mx;
//                return query(0, n, 1, 0, n);
                push(1);
                return val[1];
            }
            public int query(int l, int r, int idx, int L, int R) {
                return 0;
            }
        }
        int n, m;
        int[][] lr;
        public void solve(Scanner sc, PrintWriter pw) throws IOException {
            n = sc.nextInt();
            m = sc.nextInt();
            lr = new int[n][2];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 2; j++) {
                    lr[i][j] = sc.nextInt();
                }
            }
            SegmentTree st = new SegmentTree(m + 1);
            int[] initialArr = new int[m + 1];
            for (int i = 0; i < initialArr.length; i++) {
                initialArr[i] = -(initialArr.length - i);
            }
            st.build(initialArr);
            Arrays.sort(lr, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0] - o2[0];
                }
            });
            int maxVal = n - m;
            int free = 0;
            for (int i = 0; i < n; i++) {
                int l = lr[i][0];
                int r = lr[i][1];
                if (r <= m) {
                    st.addRange(0, r + 1, 1);
                } else {
                    free++;
                }
                maxVal = Math.max(maxVal, st.query() - l + free);
            }
            pw.println(Math.max(0, maxVal));
        }
    }

    // template, actual code is in class Task.
    static long TIME_START, TIME_END;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner(new FileInputStream("Test.in"));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
//        PrintWriter pw = new PrintWriter(new FileOutputStream("Test.out"));

        Runtime runtime = Runtime.getRuntime();
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        TIME_START = System.currentTimeMillis();
        Task t = new Task();
        t.solve(sc, pw);
        TIME_END = System.currentTimeMillis();
        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
        pw.close();
//        System.err.println("Memory increased: " + (usedMemoryAfter - usedMemoryBefore) / 1000000);
//        System.err.println("Time used: " + (TIME_END - TIME_START) + ".");
    }

    // Faster IO with BufferedReader wrapped with Scanner
    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader s) throws FileNotFoundException {
            br = new BufferedReader(s);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}