//package com.company;

import java.io.*;
import java.util.*;


public class Main {
    public static class Task {

        public void solve(Scanner sc, PrintWriter pw) throws IOException {
            long K = sc.nextInt();
            long A = sc.nextInt();
            long B = sc.nextInt();
            long biscuit = 1;
            if (K < A - biscuit) {
                pw.println(biscuit + K);
                return;
            }
            K -= (A - biscuit);
            biscuit = A;
            if (B - A >= 2) {
                long gain = B - A;
                long times = K / 2;
                biscuit += gain * times;
                K -= times * 2;
            }
            biscuit += K;
            pw.println(biscuit);

        }

    }

    private static long TIME_START, TIME_END;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner(new FileInputStream("23.in"));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
//        PrintWriter pw = new PrintWriter(new FileOutputStream("froggy.out"));


//        PrintWriter pw = new PrintWriter(new FileOutputStream("Test.in"));
        Runtime runtime = Runtime.getRuntime();
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        TIME_START = System.currentTimeMillis();
        Task t = new Task();
        t.solve(sc, pw);
        TIME_END = System.currentTimeMillis();
        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
        pw.close();
        System.out.println("Memory increased:" + (usedMemoryAfter-usedMemoryBefore) / 1000000 );
        System.out.println("Time used: " + (TIME_END - TIME_START) + ".");
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s){  br = new BufferedReader(new InputStreamReader(s));}

        public Scanner(FileReader s) throws FileNotFoundException {br = new BufferedReader(s);}

        public String next() throws IOException
        {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {return Integer.parseInt(next());}

        public long nextLong() throws IOException {return Long.parseLong(next());}

        public String nextLine() throws IOException {return br.readLine();}

        public double nextDouble() throws IOException { return Double.parseDouble(next()); }

        public boolean ready() throws IOException {return br.ready();}
    }
}