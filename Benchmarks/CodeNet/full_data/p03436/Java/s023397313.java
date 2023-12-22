import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayDeque;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        int bfs(TaskD.Vertex start, TaskD.Vertex end) {
            HashSet<TaskD.Vertex> checkedVertices = new HashSet<>();
            ArrayDeque<TaskD.Vertex> vertices = new ArrayDeque<>();

            vertices.add(start);

            int distance = 1;
            while (vertices.size() > 0) {
                int queueSize = vertices.size();
                for (int i = 0; i < queueSize; i++) {
                    TaskD.Vertex v = vertices.poll();
                    for (int j = 0; j < v.getDegree(); j++) {
                        TaskD.Vertex next = v.getEdge(j).getVertex();
                        if (next == end) return distance;
                        if (!checkedVertices.contains(next)) {
                            vertices.add(next);
                            checkedVertices.add(next);
                        }
                    }
                }
                distance++;
            }

            return -1;
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final int h = in.nextInt();
            final int w = in.nextInt();
            final char black = '#';

            boolean[][] isBlack = new boolean[w][h];
            int blackFloorNum = 0;
            for (int j = 0; j < h; j++) {
                String s = in.next();
                for (int i = 0; i < w; i++) {
                    if (s.charAt(i) == black) {
                        isBlack[i][j] = true;
                        blackFloorNum++;
                    }
                }
            }

            TaskD.Vertex[][] grid = new TaskD.Vertex[w][h];
            for (int i = 0; i < w; i++) {
                for (int j = 0; j < h; j++) {
                    grid[i][j] = new TaskD.Vertex(-1);
                }
            }

            // set lattice-like edges
            for (int j = 0; j < h; j++) {
                for (int i = 0; i < w; i++) {
                    if (isBlack[i][j]) continue;
                    // set horizontal edges
                    if (i != w - 1 && !isBlack[i + 1][j]) {
                        grid[i][j].setEdge(grid[i + 1][j], 1);
                        grid[i + 1][j].setEdge(grid[i][j], 1);
                    }
                    // set vertical edges
                    if (j != h - 1 && !isBlack[i][j + 1]) {
                        grid[i][j].setEdge(grid[i][j + 1], 1);
                        grid[i][j + 1].setEdge(grid[i][j], 1);
                    }
                }
            }

            int whiteFloorNum = bfs(grid[0][0], grid[w - 1][h - 1]) + 1;
            int ans = (whiteFloorNum > 0) ? (w * h - blackFloorNum - whiteFloorNum) : -1;

            out.println(ans);
        }

        static class Vertex {
            private int value;
            private ArrayList<TaskD.Edge> edges = new ArrayList<TaskD.Edge>();

            Vertex() {
            }

            Vertex(int v) {
                this.value = v;
            }

            void setEdge(TaskD.Vertex v, int cost) {
                this.edges.add(new TaskD.Edge(v, cost));
            }

            int getDegree() {
                return this.edges.size();
            }

            TaskD.Edge getEdge(int index) {
                return this.edges.get(index);
            }

        }

        static class Edge {
            private TaskD.Vertex v;
            private int cost;

            Edge() {
                this.v = v;
            }

            Edge(TaskD.Vertex v) {
                this.v = v;
            }

            Edge(TaskD.Vertex v, int c) {
                this.v = v;
                this.cost = c;
            }

            TaskD.Vertex getVertex() {
                return this.v;
            }

        }

    }
}

