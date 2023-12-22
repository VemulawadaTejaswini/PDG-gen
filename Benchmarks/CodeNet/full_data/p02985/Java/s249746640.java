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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EVirusTree2 solver = new EVirusTree2();
        solver.solve(1, in, out);
        out.close();
    }

    static class EVirusTree2 {
        long mod = 1_000_000_007;
        long[] fact;
        long[] factR;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            EVirusTree2.Node[] nodes = new EVirusTree2.Node[n];
            for (int i = 0; i < n; i++)
                nodes[i] = new EVirusTree2.Node();
            for (int i = 0; i < n - 1; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                nodes[a].id = a + 1;
                nodes[b].id = b + 1;
                nodes[a].nexts.add(nodes[b]);
                nodes[b].nexts.add(nodes[a]);
            }
            fact = new long[k + 1];
            factR = new long[k + 1];
            fact[1] = k - 2;
            factR[1] = k - 1;
            for (int i = 2; i < k; i++) {
                fact[i] = fact[i - 1] * (k - 1 - i);
                factR[i] = factR[i - 1] * (k - i);
                fact[i] %= mod;
                factR[i] %= mod;
            }
            EVirusTree2.Node root = nodes[0];
            root.isAdded = true;
            long res = solveMe(k, root, k);
            out.println(res);
        }

        private long solveMe(int k, EVirusTree2.Node node, long res) {
            int siblings = node.nexts.size() - 1;
            if (node.level == 0)
                siblings++;
            if (siblings == 0)
                return res;
            if (siblings >= k)
                return -1;
            if (node.level == 0) {
                res *= factR[siblings];
            } else {
                res *= fact[siblings];
            }
            res %= mod;

            for (EVirusTree2.Node child : node.nexts) {
                if (child.isAdded)
                    continue;
                child.level = node.level + 1;
                child.isAdded = true;
                res = solveMe(k, child, res);
            }
            return res;
        }

        public static class Node {
            int level;
            boolean isAdded;
            List<EVirusTree2.Node> nexts = new ArrayList<>();
            int id;

        }

    }
}

