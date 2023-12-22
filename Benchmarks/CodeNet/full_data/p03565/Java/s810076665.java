import java.io.*;
import java.util.*;

public class Main {

    private static class InputReader {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException exp) {
                    throw new RuntimeException(exp);
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
    }

    public static void main(String[] args) {    //throws FileNotFoundException {
        InputStream inputStream = System.in;    //new FileInputStream("input.txt");
        OutputStream outputStream = System.out; //new FileOutputStream("output.txt");
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Task newTask = new Task();
        newTask.solve(in, out);

        out.close();
    }

    private static class Task {
        //.constant
        private final int INF = Integer.MAX_VALUE;
        private final int MOD = (int)1e9 + 7;

        //.data

        //.code
        public void solve(InputReader in, PrintWriter out) {
            String s = in.next();
            String t = in.next();

            for (int i = s.length() - t.length(); i >= 0; --i) {
                String sub = s.substring(i, i + t.length());
                boolean flag = true;
                for (int j = 0; j < t.length(); ++j) {
                    if (t.charAt(j) != sub.charAt(j) && sub.charAt(j) != '?') {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    StringBuilder ans = new StringBuilder();
                    for (int j = 0; j < i; ++j) {
                        ans.append((s.charAt(j) == '?') ? 'a' : s.charAt(j));
                    }
                    ans.append(t);
                    for (int j = i + t.length(); j < s.length(); ++j) {
                        ans.append((s.charAt(j) == '?') ? 'a' : s.charAt(j));
                    }
                    out.println(ans);
                    return;
                }
            }

            out.println("UNRESTORABLE");

        }//end

    }

}