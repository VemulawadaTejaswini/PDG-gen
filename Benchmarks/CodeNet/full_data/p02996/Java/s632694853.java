import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = readInt(reader);

            PriorityQueue<Task> queue = new PriorityQueue<>(N, new Comparator<Task>() {
                @Override
                public int compare(Task o1, Task o2) {
                    return Long.compare(o1.limit, o2.limit);
                }
            });

            for (int i = 0; i < N; i++) {
                long[] array = readLongArray(reader);
                queue.add(new Task(array[0], array[1]));
            }

            long timeSum = 0;
            while (queue.size() > 0) {
                Task task = queue.poll();

                timeSum += task.time;
                if (timeSum > task.limit) {
                    System.out.println("No");
                    return;
                }
            }

            System.out.println("Yes");
        }
    }

    public static class Task {

        public long time;

        public long limit;

        public Task(long a, long b) {
            time = a;
            limit = b;
        }

    }

    public static int readInt(BufferedReader reader) throws Exception {
        return Integer.parseInt(reader.readLine());
    }

    public static long[] readLongArray(BufferedReader reader) throws Exception {
        String[] str = reader.readLine().split(" ");
        long[] array = new long[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Long.parseLong(str[i]);
        }
        return array;
    }

}
