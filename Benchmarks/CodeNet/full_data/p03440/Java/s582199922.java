import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        APC001D solver = new APC001D();
        solver.solve(1, in, out);
        out.close();
    }

    static class APC001D {
        public void searchAllConectedVertices(APC001D.Vertex v, LinkedList<APC001D.Vertex> connected, HashSet<APC001D.Vertex> checked) {
            // dfs
            connected.add(v);
            checked.add(v);
            for (int i = 0; i < v.getDegree(); i++) {
                APC001D.Vertex nextV = v.getEdge(i).getVertex();
                if (!checked.contains(nextV)) searchAllConectedVertices(nextV, connected, checked);
            }
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            ArrayList<APC001D.Vertex> v = new ArrayList<>();

            if (n < (n - 1 - m) * 2) {
                out.println("Impossible");
                return;
            }
            if (m == n - 1) {
                out.println(0);
                return;
            }

            for (int i = 0; i < n; i++) {
                APC001D.Vertex nv = new APC001D.Vertex(in.nextInt());
                v.add(nv);
            }
            for (int i = 0; i < m; i++) {
                int indexA = in.nextInt();
                int indexB = in.nextInt();
                APC001D.Vertex v1 = v.get(indexA);
                APC001D.Vertex v2 = v.get(indexB);
                v1.setEdge(v2);
                v2.setEdge(v1);
            }

            ArrayList<LinkedList<APC001D.Vertex>> forest = new ArrayList<LinkedList<APC001D.Vertex>>();
            HashSet<APC001D.Vertex> joined = new HashSet<APC001D.Vertex>();
            for (APC001D.Vertex cv : v) {
                if (joined.contains(cv)) continue;
                LinkedList<APC001D.Vertex> tree = new LinkedList<APC001D.Vertex>();
                searchAllConectedVertices(cv, tree, joined);
                Comparator<APC001D.Vertex> valueComparator = Comparator.comparing(APC001D.Vertex::getValue);
                tree.sort(valueComparator);
                forest.add(tree);
            }

            long costSum = 0;
            HashSet<APC001D.Vertex> checked = new HashSet<APC001D.Vertex>();
            int restOfEdges = (n - 1 - m) * 2;

            for (int i = 0; i < forest.size(); i++) {
                LinkedList<APC001D.Vertex> ti = forest.get(i);
                APC001D.Vertex tiVertex = ti.get(0);
                int tiMinCost = tiVertex.getValue();
                costSum += tiMinCost;
                checked.add(tiVertex);
                restOfEdges--;
            }

            Comparator<APC001D.Vertex> valueComparator = Comparator.comparing(APC001D.Vertex::getValue);
            v.sort(valueComparator);
            int index = 0;
            while (restOfEdges > 0) {
                APC001D.Vertex cv = v.get(index);
                if (!checked.contains(cv)) {
                    costSum += cv.getValue();
                    restOfEdges--;
                }
                index++;
            }

            out.println(costSum);
        }

        static class Vertex {
            private int value;
            private boolean hasValue = false;
            private ArrayList<APC001D.Edge> edges = new ArrayList<APC001D.Edge>();

            Vertex() {
            }

            Vertex(int v) {
                this.value = v;
                this.hasValue = true;
            }

            void setEdge(APC001D.Vertex v) {
                this.edges.add(new APC001D.Edge(v));
            }

            int getValue() {
                return this.value;
            }

            int getDegree() {
                return this.edges.size();
            }

            APC001D.Edge getEdge(int index) {
                return this.edges.get(index);
            }

        }

        static class Edge {
            private APC001D.Vertex v;
            private int cost;

            Edge() {
                this.v = v;
            }

            Edge(APC001D.Vertex v) {
                this.v = v;
            }

            Edge(APC001D.Vertex v, int c) {
                this.v = v;
                this.cost = c;
            }

            APC001D.Vertex getVertex() {
                return this.v;
            }

        }

    }
}

