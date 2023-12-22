import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Collection;
import java.util.Scanner;
import java.util.Queue;
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
        EHopscotchAddict solver = new EHopscotchAddict();
        solver.solve(1, in, out);
        out.close();
    }

    static class EHopscotchAddict {
        EHopscotchAddict.Vertex[] vertices;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            vertices = new EHopscotchAddict.Vertex[n];
            for (int i = 0; i < n; i++) {
                vertices[i] = new EHopscotchAddict.Vertex();
                vertices[i].id = i + 1;
            }
            for (int i = 0; i < m; i++) {
                vertices[in.nextInt() - 1].next.add(vertices[in.nextInt() - 1]);
            }
            int res = solveMe(vertices, n, m, vertices[in.nextInt() - 1], vertices[in.nextInt() - 1]);
            out.println(res);
        }

        private int solveMe(EHopscotchAddict.Vertex[] vertices, int n, int m, EHopscotchAddict.Vertex source, EHopscotchAddict.Vertex dest) {
            Queue<EHopscotchAddict.Vertex> queue = new ArrayDeque<>();
            queue.add(source);
            source.isAdded = 1;
            while (!queue.isEmpty()) {
                EHopscotchAddict.Vertex curr = queue.remove();
                for (int i = 0; i < 3; i++) {
                    if (((curr.isAdded & (1 << i)) != 0) && (curr.isUsed & (1 << i)) == 0) {
                        curr.isUsed |= (1 << i);
                        for (EHopscotchAddict.Vertex v : curr.next) {
                            v.distances[(i + 1) % 3] = curr.distances[i] + 1;
                            if (v == dest && v.distances[(i + 1) % 3] % 3 == 0)
                                return v.distances[(i + 1) % 3] / 3;
                            queue.add(v);
                            v.isAdded |= (1 << ((i + 1) % 3));

                            //System.err.println("[" + v.id + "]  = " + v.distances[(i + 1) % 3] + " isAdded = " + v.isAdded);
                        }
                    }

                }
            }
            return -1;
        }

        public static class Vertex {
            List<EHopscotchAddict.Vertex> next = new ArrayList<>();
            int isAdded;
            int isUsed;
            int distances = new int[3];
            int id;

        }

    }
}

