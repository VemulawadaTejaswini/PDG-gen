import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
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
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            ArrayList<APC001D.Vertex> v = new ArrayList<APC001D.Vertex>();

            for (int i = 0; i < n; i++) {
                APC001D.Vertex nv = new APC001D.Vertex();
                nv.setValue(in.nextInt());
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

            ArrayList<APC001D.Tree> t = new ArrayList<APC001D.Tree>();
            HashSet<APC001D.Vertex> joined = new HashSet<APC001D.Vertex>();
            for (APC001D.Vertex cv : v) {
                if (joined.contains(cv)) continue;
                APC001D.Tree nt = new APC001D.Tree();
                nt.joinVertices(cv);
                for (int j = 0; j < nt.getVerticesSize(); j++) {
                    joined.add(nt.getVertex(j));
                }
                t.add(nt);
            }

            if (n < (n - 1 - m) * 2) {
                out.println("impossible");
                return;
            }
            if (m == n - 1) {
                out.println(0);
                return;
            }

            HashSet<APC001D.Vertex> checked = new HashSet<>();
            int costSum = 0;
            while (t.size() > 1) {
                Comparator<APC001D.Tree> verticesSizeComparator = Comparator.comparing(APC001D.Tree::getVerticesSize);
                t.sort(verticesSizeComparator.reversed());
                APC001D.Tree t1 = t.get(0);
                APC001D.Tree t2 = t.get(1);
                APC001D.Vertex t1Vertex = new APC001D.Vertex();
                APC001D.Vertex t2Vertex = new APC001D.Vertex();
                int t1MinCost = Integer.MAX_VALUE;
                int t2MinCost = Integer.MAX_VALUE;
                for (int i = 0; i < t1.getVerticesSize(); i++) {
                    APC001D.Vertex cv = t1.getVertex(i);
                    if (checked.contains(cv)) continue;
                    int cost = cv.getValue();
                    if (cost < t1MinCost) {
                        t1Vertex = cv;
                        t1MinCost = cost;
                    }
                }
                for (int i = 0; i < t2.getVerticesSize(); i++) {
                    APC001D.Vertex cv = t2.getVertex(i);
                    if (checked.contains(cv)) continue;
                    int cost = cv.getValue();
                    if (cost < t2MinCost) {
                        t2Vertex = cv;
                        t2MinCost = cost;
                    }
                }
                costSum += t1MinCost + t2MinCost;
                t1Vertex.setEdge(t2Vertex);
                t2Vertex.setEdge(t1Vertex);
                checked.add(t1Vertex);
                checked.add(t2Vertex);
                t1.mergeTree(t2);
                t.remove(t2);
            }
            out.println(costSum);
        }

        static class Vertex {
            private int x;
            private int y;
            private int value;
            private boolean hasValue = false;
            private ArrayList<APC001D.Edge> edges = new ArrayList<APC001D.Edge>();

            Vertex() {
            }

            Vertex(int x) {
                this.x = x;
            }

            Vertex(int x, int y) {
                this.x = x;
                this.y = y;
            }

            void setValue(int v) {
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

        static class Tree {
            private ArrayList<APC001D.Vertex> vertices = new ArrayList<APC001D.Vertex>();

            Tree() {
            }

            public void addVertex(APC001D.Vertex v) {
                vertices.add(v);
            }

            public APC001D.Vertex getVertex(int index) {
                return vertices.get(index);
            }

            public int getVerticesSize() {
                return vertices.size();
            }

            boolean contains(APC001D.Vertex v) {
                for (int i = 0; i < this.vertices.size(); i++) {
                    if (this.vertices.get(i) == v) return true;
                }
                return false;
            }

            private void joinVertices(APC001D.Vertex v) {
                this.addVertex(v);
                for (int i = 0; i < v.getDegree(); i++) {
                    APC001D.Vertex nv = v.getEdge(i).getVertex();
                    if (!contains(nv)) {
                        joinVertices(nv);
                    }
                }
            }

            public void mergeTree(APC001D.Tree t) {
                for (int i = 0; i < t.getVerticesSize(); i++) {
                    this.addVertex(t.getVertex(i));
                }
            }

        }

    }
}

