import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class Main {
    public void solve(Stdin stdin, PrintWriter stdout) throws NumberFormatException, IOException {
        int h = stdin.nextInt();
        int w = stdin.nextInt();
        int[][] a = new int[h][w];
        int[][] b = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                a[i][j] = stdin.nextInt();
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                b[i][j] = stdin.nextInt();
            }
        }

        List<List<Set<Integer>>> c = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            List<Set<Integer>> row = new ArrayList<>();
            for (int j = 0; j < w; j++) {
                row.add(new HashSet<>());
            }
            c.add(row);
        }

        c.get(0).get(0).add(Math.abs(a[0][0] - b[0][0]));
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                for (int q : c.get(i).get(j)) {
                    if (i < h - 1) {
                        int p = Math.abs(a[i + 1][j] - b[i + 1][j]);
                        c.get(i + 1).get(j).add(Math.abs(p - q));
                        c.get(i + 1).get(j).add(Math.abs(p + q));
                    }
                    if (j < w - 1) {
                        int p = Math.abs(a[i][j + 1] - b[i][j + 1]);
                        c.get(i).get(j + 1).add(Math.abs(p - q));
                        c.get(i).get(j + 1).add(Math.abs(p + q));
                    }
                }
            }
        }
        stdout.println(Collections.min(c.get(h - 1).get(w - 1)));
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        Stdin stdin = new Stdin();
        PrintWriter stdout = new PrintWriter(System.out, false);
        new Main().solve(stdin, stdout);
        stdout.flush();
    }

    public static class Stdin {
        private Deque<String> queue;
        private BufferedReader stdin;
        private Pattern delimiter;

        public Stdin() {
            queue = new ArrayDeque<>();
            stdin = new BufferedReader(new InputStreamReader(System.in));
            delimiter = Pattern.compile(" ");
        }

        public String next() throws IOException {
            if (queue.isEmpty()) {
                delimiter.splitAsStream(stdin.readLine()).forEach(queue::addLast);
            }
            return queue.removeFirst();
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }
    }
}
