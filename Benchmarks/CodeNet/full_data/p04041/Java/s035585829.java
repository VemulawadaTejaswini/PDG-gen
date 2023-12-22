//package com.company;
// Always comment out package when submitting.
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static class Task {

        int mod = 1_000_000_007;
        int n, x, y, z;
        int[][] dp;
        int add(int a, int b) {
            return (a + b) % mod;
        }
        boolean on(int state, int b) {
            return ((1 << b) & state) != 0;
        }
        int set(int state, int b) {
            return state | (1 << b);
        }
        int trans(int state, int number) {
            int possibleState = 0;
            if (on(state, 0)) {
                possibleState = set(possibleState, 0);
            }
            for (int i = 0; i < x; i++) {
                if (on(state, i) && i + number <= x) {
                    possibleState = set(possibleState, i + number);
                }
            }
            for (int i = x; i < x + y; i++) {
                if (on(state, i) && i + number <= x + y) {
                    possibleState = set(possibleState, i + number);
                }
            }
            for (int i = x + y; i < x + y + z; i++) {
                if (on(state, i) && i + number <= x + y + z) {
                    possibleState = set(possibleState, i + number);
                }
            }
            if (on(state, x + y + z)) {
                possibleState = set(possibleState, x + y + z);
            }
            if (on(possibleState, x + y + z)) {
                int yy = 1;
                yy++;
            }
            return possibleState;
        }
        public void solve(Scanner sc, PrintWriter pw) throws IOException {
            n = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            dp = new int[n + 1][1 << (x + y + z + 1)];
            dp[0][1] = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 1 << (x + y + z + 1); j++) if (dp[i][j] > 0){
                    for (int k = 1; k <= 10; k++) {
                        int next = trans(j, k);
                        dp[i + 1][next] = add(dp[i + 1][next], dp[i][j]);
                    }
                }
            }
            int tot = 0;
            for (int i = 0; i < 1 << (x + y + z + 1); i++) {
                if (on(i, x + y + z) && dp[n][i] > 0) {
                    tot = add(tot, dp[n][i]);
                }
            }
            pw.println(tot);
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