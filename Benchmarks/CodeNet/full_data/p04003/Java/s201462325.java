//package com.company;
// Always comment out package when submitting.
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static class Task {

        public void solve(Scanner sc, PrintWriter pw) throws IOException {
            int n = sc.nextInt();
            int m = sc.nextInt();
            List<int[]>[] lines = new List[n];
            Map<Integer, Map<Integer, List<Integer>>> coloredLines = new HashMap<>();
            for (int i = 0; i < n; i++) {
                lines[i] = new ArrayList<>();
            }
            for (int i = 0; i < m; i++) {
                int p = sc.nextInt() - 1;
                int q = sc.nextInt() - 1;
                int c = sc.nextInt() - 1;
                lines[p].add(new int[]{q, c});
                lines[q].add(new int[]{p, c});
                if (!coloredLines.containsKey(c)) {
                    coloredLines.put(c, new HashMap<>());
                }
                if (!coloredLines.get(c).containsKey(p)) {
                    coloredLines.get(c).put(p, new ArrayList<>());
                }
                coloredLines.get(c).get(p).add(q);
                if (!coloredLines.get(c).containsKey(q)) {
                    coloredLines.get(c).put(q, new ArrayList<>());
                }
                coloredLines.get(c).get(q).add(p);
            }
            Map<Integer, Set<Integer>> visit  = new HashMap<>();
            int currentCost = 0;
            Set<Integer> curExplore = new HashSet<>();
            curExplore.add(0);
            while (true) {
                currentCost ++;
                Set<Integer> newPlaces = new HashSet<>();
                for (int explore: curExplore) {
                    for (int[] edge: lines[explore]) {
                        if (!visit.containsKey(edge[1])) visit.put(edge[1], new HashSet<>());
                        if (!visit.get(edge[1]).contains(edge[0])) {
                            dfs(explore, coloredLines.get(edge[1]), visit.get(edge[1]), newPlaces);
                            if (newPlaces.contains(n - 1)) {
                                pw.println(currentCost);
                                return;
                            }
                        }
                    }
                }
                if (newPlaces.size() == 0) {
                    pw.println("-1");
                    return;
                }
                curExplore = newPlaces;
            }
        }

        public void dfs(int cur, Map<Integer, List<Integer>> edges, Set<Integer> visit, Set<Integer> newPlaces) {
            visit.add(cur);
            newPlaces.add(cur);
            if (edges.containsKey(cur)) {
                for (int next: edges.get(cur)) if (!visit.contains(next)) {
                    dfs(next, edges, visit, newPlaces);
                }
                edges.remove(cur);
            }
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