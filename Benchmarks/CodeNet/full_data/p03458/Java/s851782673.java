//package com.company;

import java.io.*;
import java.util.*;

public class Main {
    static long TIME_START, TIME_END;
    public static void main(String[] args) throws IOException {
        MyScanner sc = new MyScanner(System.in);
//        MyScanner sc = new MyScanner(new FileInputStream("Test.in"));
        PrintWriter pw = new PrintWriter(System.out);
        TIME_START = System.currentTimeMillis();
        Task.solve(sc, pw);
        TIME_END = System.currentTimeMillis();
//        pw.println("Time used: " + (TIME_END - TIME_START) + ".");
        pw.close();
    }

    public static class Task {
        static int n;
        static int k;
        static int[] xi;
        static int[] yi;
        static int[][] countLD;
        static int[][] countRU;
        static int[][] gridPoint;
        public static void solve(MyScanner sc, PrintWriter pw) throws IOException {
            n = sc.nextInt();
            k = sc.nextInt();
            xi = new int[n];
            yi = new int[n];
            countLD = new int[2 * k + 2][2 * k + 2];
            countRU = new int[2 * k + 2][2 * k + 2];
            gridPoint = new int[2 * k + 2][2 * k + 2];
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                char c = sc.next().charAt(0);
                if (c == 'B') {
                    x += k;
                }
                x %= (2 * k);
                y %= (2 * k);
                gridPoint[x + 1][y + 1]++;
            }
            for (int i = 1; i <= 2 * k; i++) {
                for (int j = 1; j <= 2 * k; j++) {
                    countLD[i][j] = countLD[i - 1][j] + countLD[i][j - 1] - countLD[i - 1][j - 1] + gridPoint[i][j];
                }
            }
            for (int i = 2* k; i >= 1; i--) {
                for (int j = 2 * k; j >= 1; j--) {
                    countRU[i][j] = countRU[i + 1][j] + countRU[i][j + 1] - countRU[i + 1][j + 1] + gridPoint[i][j];
                }
            }
            int max = 0;
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    int c = countLD[i + k][j + k] + countRU[i + k + 1][j + k + 1];
                    max = Math.max(max, c);
                }
            }
            pw.println(max);
        }

    }

    static class MyScanner {
        StringTokenizer st;
        BufferedReader br;

        public MyScanner(InputStream s){  br = new BufferedReader(new InputStreamReader(s));}

        public MyScanner(FileReader s) throws FileNotFoundException {br = new BufferedReader(s);}

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
