import java.io.*;
import java.util.*;

public class Main {
    static final String YES = "Yes";
    static final String NO = "No";

    static class Task implements Comparable<Task> {
        final long A;
        final long B;

        Task(final long A, final long B) {
            this.A = A;
            this.B = B;
        }

        @Override
        public int compareTo(Task o) {
            return Long.compare(this.B, o.B);
        }
    }

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        final PriorityQueue<Task> tasks = new PriorityQueue<>();
        for(int i = 0 ; i < N ; i++){
            tasks.add(new Task(sc.nextLong(), sc.nextLong()));
        }

        final Solver solver = new Solver();
        System.out.println(solver.solve(tasks));
    }
}

class Solver {
    public String solve(final PriorityQueue<Main.Task> tasks) {
        long sum = 0;
        while (!tasks.isEmpty()) {
            final Main.Task task = tasks.poll();
            sum += task.A;
            if (sum > task.B) {
                return "No";
            }
        }
        return "Yes";
    }
}

