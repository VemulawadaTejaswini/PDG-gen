//package com.company;
// Always comment out package when submitting.
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static class Task {
        public class Point {
            long[] coord = new long[2];
            int idx;

            public Point(int x, int y, int idx) {
                this.coord[0] = x + y;
                this.coord[1] = y - x;
                this.idx = idx;
            }

            public long dist(Point other) {
                return Math.max(Math.abs(coord[0] - other.coord[0]), Math.abs(coord[1] - other.coord[1]));
            }
        }
        int n;
        Point[] points;
        public void solve(Scanner sc, PrintWriter pw) throws IOException {
            n = sc.nextInt();
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            points = new Point[n];
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                points[i] = new Point(x, y, i);
            }
            long dist = points[a].dist(points[b]);
            Set<Integer>[] edges = new Set[n];
            for (int i = 0; i < n; i++) {
                edges[i] = new HashSet<>();
            }
            solve(points, dist, 0, edges, true);
            solve(points, dist, 1, edges, true);
            boolean[] visit = new boolean[n];
            dfs(edges, visit, a);
            dfs(edges, visit, b);
            int countI = 0;
            for (boolean bb: visit) if (bb) countI++;
            Point[] sbPoints = new Point[countI];
            countI = 0;
            for (int i = 0; i < n; i++) {
                if (visit[i]) sbPoints[countI++] = points[i];
            }
            long tot = 0;
            tot += solve(sbPoints, dist, 0, null, true);
            tot += solve(sbPoints, dist, 1, null, false);
            pw.println(tot);

        }

        public int binarySearchLow(Point[] points, int index, long coordinateVal, long minOtherVal, long maxOtherVal) {
            int sub = 1 - index;
            int lo = 0, hi = points.length;
            while (lo < hi - 1) {
                int mid = (lo + hi) >> 1;
                if (points[mid].coord[index] < coordinateVal) {
                    lo = mid + 1;
                } else if (points[mid].coord[index] > coordinateVal) {
                    hi = mid;
                } else if (points[mid].coord[sub] < minOtherVal) {
                    lo = mid + 1;
                } else {
                    hi = mid;
                }
            }
            for (int i = Math.max(0, lo - 2); i < Math.min(points.length, lo + 2); i++) {
                if (points[i].coord[index] == coordinateVal && points[i].coord[sub] >= minOtherVal && points[i].coord[sub] <= maxOtherVal) {
                    return i;
                }
            }
            return -1;
        }

        public int binarySearchHigh(Point[] points, int index, long coordinateVal, long minOtherVal, long maxOtherVal) {
            int sub = 1 - index;
            int lo = 0, hi = points.length;
            while (lo < hi - 1) {
                int mid = (lo + hi) >> 1;
                if (points[mid].coord[index] < coordinateVal) {
                    lo = mid + 1;
                } else if (points[mid].coord[index] > coordinateVal) {
                    hi = mid;
                } else if (points[mid].coord[sub] > maxOtherVal) {
                    hi = mid;
                } else {
                    lo = mid + 1;
                }
            }
            for (int i = Math.min(points.length, lo + 3) - 1; i >= Math.max(0, lo - 2); i--) {
                if (points[i].coord[index] == coordinateVal && points[i].coord[sub] >= minOtherVal && points[i].coord[sub] <= maxOtherVal) {
                    return i;
                }
            }
            return -1;
        }

        public void addEdge(Set<Integer>[] edges, int a, int b) {
            if (edges == null) return;
//            if (a < b){
                edges[a].add(b);
//            } else {
                edges[b].add(a);
//            }
        }

        public void dfs(Set<Integer>[] edges, boolean[] visit, int cur) {
            visit[cur] = true;
            for (int next: edges[cur]) if (!visit[next]) dfs(edges, visit, next);
        }

        public long solve(Point[] points, long dist, int index, Set<Integer>[] edges, boolean cS) {
            int sub = 1 - index;
            Arrays.sort(points, new Comparator<Point>() {
                @Override
                public int compare(Point o1, Point o2) {
                    if (o1.coord[index] == o2.coord[index]) return Long.compare(o1.coord[sub], o2.coord[sub]);
                    return Long.compare(o1.coord[index], o2.coord[index]);
                }
            });
            long count = 0;
            int fast = 0;
            for (int i = 0; i < points.length; i++) {
                long mm = points[i].coord[index];
                long kk = points[i].coord[sub];
                long cv = mm + dist;
                long minV = kk - dist;
                long maxV = kk + dist;
                if (!cS) {
                    minV++;
                    maxV--;
                }
                int nextLow = binarySearchLow(points, index, cv, minV, maxV);
                int nextLarge = binarySearchHigh(points, index, cv, minV, maxV);
                if ((nextLow == -1) != (nextLarge == -1)) {
                    throw new RuntimeException();
                }
                if (nextLarge == -1) continue;
                count += nextLarge - nextLow + 1;
                addEdge(edges, points[i].idx, points[nextLow].idx);
                if (nextLow >= fast) {
                    for (int j = nextLow; j < nextLarge; j++) {
                        addEdge(edges, points[j].idx, points[j + 1].idx);
                    }
                    fast = nextLarge + 1;
                } else if (nextLarge >= fast) {
                    for (int j = fast; j < nextLarge; j++) {
                        addEdge(edges, points[j].idx, points[j + 1].idx);
                    }
                    fast = nextLarge + 1;
                }
            }
            return count;
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