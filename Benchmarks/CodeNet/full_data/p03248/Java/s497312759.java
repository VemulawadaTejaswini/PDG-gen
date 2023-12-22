import java.io.*;
import java.math.*;
import java.util.*;

class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] s = sc.nextLine().chars().map(c -> c - '0').toArray();

        boolean ok = s[0] == 1 && s[s.length-1] == 0;
        for (int i = 0; i < s.length-1; i++) {
            if (s[i] != s[s.length-2-i]) ok = false;
        }

        if (!ok) {
            System.out.println(-1);
        }
        else {
            ArrayList<Edge> edges = new ArrayList<>();
            Stack<Integer> children = new Stack<>();
            for (int v = 1; v <= s.length; v++) {
                if (s[v-1] == 1 || v == s.length) {
                    while (!children.empty()) {
                        edges.add(new Edge(v, children.pop()));
                    }
                }
                children.push(v);
            }

            for (Edge e : edges) {
                System.out.printf("%d %d\n", e.u, e.v);
            }
        }

        sc.close();
    }
}

class Edge {
    public int u, v;
    Edge(int u, int v) {
        this.u = u;
        this.v = v;
    }
}