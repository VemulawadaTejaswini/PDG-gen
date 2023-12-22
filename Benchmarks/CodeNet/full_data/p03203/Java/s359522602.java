import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStreamReader;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int width = in.nextInt();
            int height = in.nextInt();
            int n = in.nextInt();
            TaskD.Obstacle[] obstacles = new TaskD.Obstacle[n];
            for (int i = 0; i < n; ++i) {
                obstacles[i] = new TaskD.Obstacle();
                obstacles[i].x = in.nextInt();
                obstacles[i].y = in.nextInt();
            }
            Arrays.sort(obstacles, new Comparator<TaskD.Obstacle>() {

                public int compare(TaskD.Obstacle o1, TaskD.Obstacle o2) {
                    int z = o1.x - o2.x;
                    if (z == 0) z = o1.y - o2.y;
                    return z;
                }
            });
            int delta = 0;
            for (TaskD.Obstacle o : obstacles) {
                int curDelta = o.x - o.y;
                if (curDelta == delta) {
                    ++delta;
                } else if (curDelta > delta) {
                    out.println(o.x - 1);
                    return;
                }
            }
            out.println(width);
        }

        static class Obstacle {
            int x;
            int y;

        }

    }

    static class InputReader {
        public BufferedReader reader;
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

    }
}

