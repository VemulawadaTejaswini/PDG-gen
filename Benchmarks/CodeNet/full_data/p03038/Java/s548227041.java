
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        long n = Long.valueOf(input[0]);
        long m = Long.valueOf(input[1]);

        long[] a = StringArrToIntArr(scanner.nextLine().split(" "));

        PriorityQueue<Long> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (Long ai : a) {
            priorityQueue.add(ai);
        }

        for (int i = 0; i < m; i++) {
            String[] in = scanner.nextLine().split(" ");
            long b = Long.valueOf(in[0]);
            long c = Long.valueOf(in[1]);
            for(int j = 0; j < b; j++) {
                priorityQueue.add(c);
            }
        }

        long sum = 0;
        for (long i : a) {
            sum += priorityQueue.poll();
        }
        System.out.println(sum);

    }

    public static long[] StringArrToIntArr(String[] s) {
        long[] result = new long[s.length];
        for (int i = 0; i < s.length; i++) {
            result[i] = Long.valueOf(s[i]);
        }
        return result;
    }
}
