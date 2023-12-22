import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public class Node {
            ArrayList<Node> edges   = new ArrayList<>();
            int             marked  = 0;
            boolean         visited = false;
        }

        public int toInt(char a) {
            if (a > 'a') {
                return a - 'a' + 26;
            } else {
                return a - 'A';
            }
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            char[] s1 = in.next().toCharArray();
            char[] s2 = in.next().toCharArray();
            Node[] nodes = new Node[52];
            for (int i = 0; i < 52; i++) {
                nodes[i] = new Node();
            }
            for (int i = 0; i < n; i++) {
                if (s1[i] != s2[i]) {
                    if (!nodes[toInt(s1[i])].edges.contains(nodes[toInt(s2[i])])) {
                        nodes[toInt(s1[i])].edges.add(nodes[toInt(s2[i])]);
                        nodes[toInt(s2[i])].edges.add(nodes[toInt(s1[i])]);
                    }
                }
            }
            for (int i = 1; i < n; i++) {
                if (s1[i] != s1[i - 1]) {
                    if (!nodes[toInt(s1[i])].edges.contains(nodes[toInt(s1[i - 1])])) {
                        nodes[toInt(s1[i])].edges.add(nodes[toInt(s1[i - 1])]);
                        nodes[toInt(s1[i - 1])].edges.add(nodes[toInt(s1[i])]);
                    }
                }
            }
            for (int i = 1; i < n; i++) {
                if (s2[i] != s2[i - 1]) {
                    if (!nodes[toInt(s2[i])].edges.contains(nodes[toInt(s2[i - 1])])) {
                        nodes[toInt(s2[i])].edges.add(nodes[toInt(s2[i - 1])]);
                        nodes[toInt(s2[i - 1])].edges.add(nodes[toInt(s2[i])]);
                    }
                }
            }
            for(Node node : nodes){
                if(!node.edges.isEmpty()){
                    dfs(node);
                    break;
                }
            }
            out.println(sumOfWays);
        }

        long mod       = 1000000007;
        long sumOfWays = 1;

        void dfs(Node node) {
            if (node.marked >= 3) {
                if (node.visited == false) {
                    sumOfWays = 0;
                    node.visited = true;
                }
                return;
            }
            sumOfWays *= 3 - node.marked;
            sumOfWays %= mod;
            node.marked = 3;
            node.visited = true;
            for (Node n1 : node.edges) {
                n1.marked++;
            }
            for (Node n1 : node.edges) {
                dfs(n1);
            }
        }
    }

    static class InputReader {
        public BufferedReader  reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextFloat() {
            return Double.parseDouble(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }
}
