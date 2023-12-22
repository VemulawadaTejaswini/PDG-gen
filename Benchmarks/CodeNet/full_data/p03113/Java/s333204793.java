//package com.company;
// Always comment out package when submitting.

import java.io.*;
import java.util.*;

public class Main {
    // Actual Code
    public static class Task {


        public void solve(Scanner sc, PrintWriter pw) throws IOException {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[][] items = new int[n][3];
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                items[i][0] = i + 1;
                items[i][1] = a;
                items[i][2] = 0;
            }
            PriorityQueue<int[]>[] pq = new PriorityQueue[2];
            for (int i = 0; i < 2; i++) {
                pq[i] = new PriorityQueue<>(new Comparator<int[]>() {
                    @Override
                    public int compare(int[] o1, int[] o2) {
                        if (o1[2] != o2[2]) return o2[2] - o1[2];
                        return o2[1] - o1[1];
                    }
                });
            }
            for (int[] r : items) {
                pq[0].offer(r);
            }
            int curDump = 0;
            List<Integer> move = new ArrayList<>();
            int scann = 0;
            int nocheck = -1;
            outer:
            while (true) {
                while (!pq[curDump].isEmpty()) {
                    int[] vv = pq[curDump].poll();
                    vv[2] = 0;
                    if (vv[0] != nocheck) {
                        vv[1]--;
                        move.add(vv[0]);
                        if (vv[1] < 0) {
                            break outer;
                        }
                    } else {
                        vv[2] = 1;
                    }
                    if (pq[curDump].size() == 0) {
                        nocheck = vv[0];
                    }
                    pq[1 - curDump].offer(vv);
                }
                scann++;
                curDump = 1 - curDump;
                if (scann >= k + 1) break;
            }
            if (scann >= k + 1) {
                pw.println(move.size());
                for (int t: move) {
                    pw.print(t + " ");
                }
            } else {
                pw.println(-1);
            }
        }
    }

    // template, actual code is in class Task.
    static long TIME_START, TIME_END;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner(new FileInputStream("Test.in"));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
//        PrintWriter pw = new PrintWriter(new FileOutputStream("File.out"));

        Runtime runtime = Runtime.getRuntime();
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        TIME_START = System.currentTimeMillis();
        Task t = new Task();
        t.solve(sc, pw);
        TIME_END = System.currentTimeMillis();
        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
        pw.close();
        System.err.println("Memory increased:" + (usedMemoryAfter-usedMemoryBefore) / 1000000 );
        System.err.println("Time used: " + (TIME_END - TIME_START) + ".");
    }

    // Faster IO with BufferedReader wrapped with Scanner
    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s){br = new BufferedReader(new InputStreamReader(s));}

        public Scanner(FileReader s) throws FileNotFoundException {br = new BufferedReader(s);}

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {return Integer.parseInt(next());}

        public long nextLong() throws IOException {return Long.parseLong(next());}

        public String nextLine() throws IOException {return br.readLine();}

        public double nextDouble() throws IOException {return Double.parseDouble(next()); }

        public boolean ready() throws IOException {return br.ready();}
    }
}