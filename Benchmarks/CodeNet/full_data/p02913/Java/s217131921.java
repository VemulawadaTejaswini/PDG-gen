import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.HashMap;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        TaskE.TrieNode root = new TaskE.TrieNode();

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            String s = in.next();
            int res = 0;
            for (int i = 0; i < s.length(); ++i) {
                res = Math.max(res, addSubstring(root, s.substring(i), i));
            }
            out.println(res);
        }

        private int addSubstring(TaskE.TrieNode root, String substring, int start) {
            TaskE.TrieNode cur = root;
            int res = 0;
            boolean flag = true;
            for (int i = 0; i < substring.length(); ++i) {
                if (!cur.children.containsKey(substring.charAt(i))) {
                    flag = false;
                    TaskE.TrieNode node = new TaskE.TrieNode();
                    node.idx = start + i;
                    cur.children.put(substring.charAt(i), node);
                }
                cur = cur.children.get(substring.charAt(i));
                if (flag) {
                    if (cur.idx < start) {
                        ++res;
                    }
                }
            }
            return res;
        }

        static class TrieNode {
            int idx;
            Map<Character, TaskE.TrieNode> children = new HashMap<>();

        }

    }

    static class InputReader {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 23234);
            tokenizer = null;
        }

        public String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

