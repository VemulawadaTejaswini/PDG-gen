import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        Task[] tasks = new Task[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            tasks[i] = new Task(a, b);
        }

        Arrays.sort(tasks);

        boolean isFinish = true;
        int time = 0;
        for (Task task : tasks) {
            time += task.a;
            if (time > task.b) {
                isFinish = false;
                break;
            }
        }

        System.out.println(isFinish ? "Yes" : "No");
    }

    static class Task implements Comparable<Task> {
        int a, b;

        Task(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int compareTo(Task o) {
            return b - o.b;
        }
    }

    static class MyScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}