//package com.company;

import java.io.*;
import java.util.*;

public class Main {
    public static class Task {


        public List<Integer> bfsTrackCycle(int n, int m, int start, int end, List<Integer>[] edges) {
            int[] vertexList = new int[m];
            int[] vFrom = new int[m];
            Arrays.fill(vFrom, -1);
            int vFront = 0, vEnd = 0;
            vertexList[vEnd++] = start;
            while (vFront < vEnd) {
                int current = vertexList[vFront++];
                for (int next: edges[current]) {
                    if (vFrom[next] == -1) {
                        vFrom[next] = current;
                        vertexList[vEnd++] = next;
                        if (next == end) {
                            List<Integer> ret = new ArrayList<>();
                            int at = end;
                            while (at != start) {
                                ret.add(at);
                                at = vFrom[at];
                            }
                            ret.add(start);
                            return ret;
                        }
                    }
                }
            }
            return null;
        }
        public void solve(Scanner sc, PrintWriter pw) throws IOException {
            int n = sc.nextInt();
            int m = sc.nextInt();
            List<Integer>[] edges = new List[n];
            for (int i = 0; i < n; i++) {
                edges[i] = new ArrayList<>();
            }
            for (int i = 0; i < m; i++) {
                int a = sc.nextInt() - 1;
                int b = sc.nextInt() - 1;
                edges[a].add(b);
            }
            int bestSize = n + 1;
            List<Integer> ret = null;
            for (int i = 0; i < n; i++) {
                for (int next: edges[i]) {
                    List<Integer> ans = bfsTrackCycle(n, m, next, i, edges);
                    if (ans != null && ans.size() < bestSize) {
                        bestSize = ans.size();
                        ret = ans;
                    }
                }
            }
            if (ret == null) {
                pw.println(-1);
            } else {
                pw.println(ret.size());
                for (int i = 0; i < ret.size(); i++) {
                    pw.println(ret.get(ret.size() - 1 - i) + 1);
                }
            }
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
