package com.chemistrae;

import java.io.*;
import java.util.StringTokenizer;

class Pair {
    final int x;
    final int y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class DisjointSet {
    private static int[] parent, size;

    DisjointSet(int n) {
        parent = new int[n + 1];
        size = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    public int find(int u) {
        if (u == parent[u]) return u;
        return parent[u] = find(parent[u]);
    }

    public long merge(int u, int v) {
        u = find(u); v = find(v);
        if (u == v) return -1L;
        long a = (long)size[u], b = (long)size[v];
        parent[u] = v;
        size[v] += size[u];
        size[u] = 0;
        return a * (a - 1) / 2 + b * (b - 1) / 2;
    }

    public int get_size(int u) {
        u = find(u);
        return size[u];
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Pair edges[] = new Pair[m];
        long ans[] = new long[m];

        for (int i = 0; i < m; i++) {
            String es = br.readLine();
            StringTokenizer est = new StringTokenizer(es);
            int u = Integer.parseInt(est.nextToken());
            int v = Integer.parseInt(est.nextToken());
            edges[i] = new Pair(u, v);
        }

        long incon = n * (n - 1) / 2;
        DisjointSet dsu = new DisjointSet(n + 1);

        for (int i = 0; i < m; i++) {
            ans[m - i - 1] = incon;
            Pair edge = edges[m - i - 1];
            long tmp = dsu.merge(edge.x, edge.y);
            if (tmp == -1) continue;
            incon += tmp;
            long size = (long)dsu.get_size(edge.x);
            incon -= size * (size - 1) / 2;
        }

        for (int i = 0; i < m; i++) {
            System.out.println(ans[i]);
        }

    }
}
