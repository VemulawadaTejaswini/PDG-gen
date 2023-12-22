import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
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
        static APC001D.Vertex dfs(APC001D.Vertex v, APC001D.Vertex minVertex, HashSet<APC001D.Vertex> checked, HashSet<APC001D.Vertex> untouchable) {
            checked.add(v);
            APC001D.Vertex mv = minVertex;
            if (!untouchable.contains(v) && mv.getValue() > v.getValue()) mv = v;
            for (int i = 0; i < v.getDegree(); i++) {
                APC001D.Vertex nextV = v.getEdge(i).getVertex();
                if (!checked.contains(nextV)) mv = dfs(nextV, mv, checked, untouchable);
            }
            return mv;
        }

        static int setAllX(APC001D.Vertex v, int x, HashSet<APC001D.Vertex> checked, int count) {
            checked.add(v);
            count += 1;
            v.setX(x);
            for (int i = 0; i < v.getDegree(); i++) {
                APC001D.Vertex nextV = v.getEdge(i).getVertex();
                if (!checked.contains(nextV)) setAllX(nextV, x, checked, count);
            }
            return count;
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            APC001D.Graph g = new APC001D.Graph(n);
            HashSet<APC001D.Vertex> checked = new HashSet<APC001D.Vertex>();
            for (int i = 0; i < n; i++) {
                APC001D.Vertex v = new APC001D.Vertex(0);
                v.setValue(in.nextInt());
                g.setVertex(i, v);
            }

            for (int i = 0; i < m; i++) {
                int indexA = in.nextInt();
                int indexB = in.nextInt();
                APC001D.Vertex a = g.getVertex(indexA);
                APC001D.Vertex b = g.getVertex(indexB);
                a.setEdge(b);
                b.setEdge(a);
            }

            int groupNum = 1;
            int max = 0;
            int maxIndex = 0;
            int maxGroupNum = 0;
            for (int i = 0; i < n; i++) {
                APC001D.Vertex v = g.getVertex(i);
                if (v.getX() == 0) {
                    HashSet<APC001D.Vertex> group = new HashSet<APC001D.Vertex>();
                    Integer count = setAllX(v, groupNum, group, 0);
                    if (count > max) {
                        maxIndex = i;
                        maxGroupNum = groupNum;
                        max = count;
                    }
                    groupNum++;
                }
            }

            int sum = 0;
            for (int i = 1; i < groupNum; i++) {
                if (i == maxGroupNum) continue;
                for (int j = 1; j < n; j++) {
                    APC001D.Vertex v = g.getVertex(j);
                    if (v.getX() == i) {
                        HashSet<APC001D.Vertex> group = new HashSet<APC001D.Vertex>();
                        setAllX(v, maxGroupNum, group, 0);
                        group.clear();
                        APC001D.Vertex maximum = new APC001D.Vertex();
                        maximum.setValue(Integer.MAX_VALUE);
                        APC001D.Vertex v1 = dfs(g.getVertex(maxIndex), g.getVertex(maxIndex), group, checked);
                        APC001D.Vertex vi = dfs(v, v, group, checked);
                        if (v1 == maximum || vi == maximum || checked.contains(v1) || checked.contains(vi)) {
                            out.println("Impossible");
                            return;
                        }
                        checked.add(v1);
                        checked.add(vi);
                        sum += v1.getValue();
                        sum += vi.getValue();
                        vi.setEdge(v1);
                        v1.setEdge(vi);
                    }
                }
            }
            out.println(sum);
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

            void setX(int x) {
                this.x = x;
            }

            void setValue(int v) {
                this.value = v;
                this.hasValue = true;
            }

            void setEdge(APC001D.Vertex v) {
                this.edges.add(new APC001D.Edge(v));
            }

            int getX() {
                return this.x;
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

        static class Graph {
            private APC001D.Vertex[] vertices;
            private int verticesNum;

            Graph(int verticesNum) {
                this.verticesNum = verticesNum;
                this.vertices = new APC001D.Vertex[verticesNum];
                for (int i = 0; i < verticesNum; i++) {
                    this.vertices[i] = new APC001D.Vertex();
                }
            }

            void setVertex(int index, APC001D.Vertex v) {
                this.vertices[index] = v;
            }

            APC001D.Vertex getVertex(int index) {
                return this.vertices[index];
            }

        }

    }
}

