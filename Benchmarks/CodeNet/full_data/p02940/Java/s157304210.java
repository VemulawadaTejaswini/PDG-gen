//package com.company;

import java.io.*;
import java.util.*;

public class Main {
    public static class Task {

        public void solve(Scanner sc, PrintWriter pw) throws IOException {
            int[] singleCount = new int[3];
            int[] doubleCount = new int[3];
            int n = sc.nextInt();
            int empty = n;
            int[] arr = new int[3 * n];
            String s = sc.next();
            for (int i = 0; i < 3 * n; i++) {
                switch (s.charAt(i)) {
                    case 'R':
                        arr[i] = 0;
                        break;
                    case 'G':
                        arr[i] = 1;
                        break;
                    case 'B':
                        arr[i] = 2;
                        break;
                }
            }
            int mod = 998244353;
            long val = 1;
            for (int i = 0; i < 3 * n; i++) {
                int cur = arr[i], next = (arr[i] + 1) % 3, prev = (arr[i] + 2) % 3;
                if (doubleCount[cur] != 0) {
                    val = val * doubleCount[cur] % mod;
                    doubleCount[cur]--;
                } else if (singleCount[next] != 0) {
                    if (singleCount[prev] != 0) throw new RuntimeException();
                    val = val * singleCount[next] % mod;
                    singleCount[next]--;
                    doubleCount[prev]++;
                } else if (singleCount[prev] != 0) {
                    val = val * singleCount[prev] % mod;
                    singleCount[prev]--;
                    doubleCount[next]++;
                } else {
                    val = val * empty % mod;
                    empty--;
                    singleCount[cur]++;
                }
            }
            pw.println(val);
        }
    }

    static long TIME_START, TIME_END;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner(new FileInputStream("input"));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
//        PrintWriter pw = new PrintWriter(new FileOutputStream("output"));

        Runtime runtime = Runtime.getRuntime();
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        TIME_START = System.currentTimeMillis();
        Task t = new Task();
        t.solve(sc, pw);
        TIME_END = System.currentTimeMillis();
        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
        pw.close();
        System.err.println("Memory increased: " + (usedMemoryAfter - usedMemoryBefore) / 1000000);
        System.err.println("Time used: " + (TIME_END - TIME_START) + ".");
    }

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
