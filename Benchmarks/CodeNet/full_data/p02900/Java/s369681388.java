//package com.company;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static class Task {
        int[] factors;
        List<Integer> primes;

        public void precompute() {
            int M = 1_000_100;
            factors = new int[M];
            primes = new ArrayList<>();
            for (int i = 2; i < M; i++) {
                if (factors[i] == 0) {
                    factors[i] = i;
                    primes.add(i);
                }
                for (int p : primes) {
                    int j = p * i;
                    if (j >= M) break;
                    factors[j] = p;
                    if (i % p == 0) break;
                }
            }
        }

        public int factorize(long G) {
            int primeFactors = 0;
            for (int p: primes) {
                if (G % p == 0) {
                    while (G % p == 0) G /= p;
                    primeFactors++;
                }
            }
            if (G > 1) primeFactors++;
            return primeFactors;
        }


        public void solve(Scanner sc, PrintWriter pw) throws IOException {
            precompute();
            long A = sc.nextLong();
            long B = sc.nextLong();
            long G = BigInteger.valueOf(A).gcd(BigInteger.valueOf(B)).longValue();
            pw.println(factorize(G) + 1);
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
