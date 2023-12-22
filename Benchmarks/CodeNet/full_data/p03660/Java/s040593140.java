import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author bcools
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
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            TaskD.Vertex[] vs = new TaskD.Vertex[n + 1];
            for (int i = 0; i < n - 1; ++i) {
                int a = in.nextInt();
                TaskD.Vertex va = (vs[a] == null) ? new TaskD.Vertex() : vs[a];
                va.index = a;
                int b = in.nextInt();
                TaskD.Vertex vb = (vs[b] == null) ? new TaskD.Vertex() : vs[b];
                vb.index = b;
                va.adj.add(vb);
                vb.adj.add(va);
                vs[a] = va;
                vs[b] = vb;
            }
            vs[1].bDist = 0;
            vs[1].bVisit = true;
            List<TaskD.Vertex> q = new ArrayList<>();
            q.add(vs[1]);

            while (!q.isEmpty()) {
                TaskD.Vertex v = q.remove(0);
                for (TaskD.Vertex a : v.adj) {
                    if (a.bVisit) continue;
                    a.bVisit = true;
                    a.bDist = v.bDist + 1;
                    q.add(a);
                }
            }

            vs[n].wDist = 0;
            vs[n].wVisit = true;
            q.clear();
            q.add(vs[n]);
            int reach = 1;
            while (!q.isEmpty()) {
                TaskD.Vertex v = q.remove(0);
                for (TaskD.Vertex a : v.adj) {
                    if (a.wVisit) continue;
                    a.wDist = v.wDist + 1;
                    a.wVisit = true;
                    if (a.wDist < a.bDist) {
                        reach++;
                    }
                    q.add(a);
                }
            }
            if (reach > n / 2) out.println("Snuke");
            else out.println("Fennec");
        }

        static class Vertex {
            int index;
            List<TaskD.Vertex> adj = new ArrayList<>();
            int wDist = Integer.MAX_VALUE;
            int bDist = Integer.MAX_VALUE;
            boolean wVisit = false;
            boolean bVisit = false;

        }

    }
}

