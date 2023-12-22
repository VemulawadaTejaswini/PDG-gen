import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        long n = Long.valueOf(input[0]);
        long m = Long.valueOf(input[1]);

        String[] a = scanner.nextLine().split(" ");

        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>((p1, p2) -> Long.compare(p2.number, p1.number));
        for (String ai : a) {
            priorityQueue.add(new Pair(Long.valueOf(ai), 1L));
        }
        String[] in;
        for (int i = 0; i < m; i++) {
            in = scanner.nextLine().split(" ");
            priorityQueue.add(new Pair(Long.valueOf(in[1]), Long.valueOf(in[0])));
        }

        long sum = 0;
        Pair pair;
        for (int num = 0; num < a.length; num++) {
            pair = priorityQueue.poll();
            sum += pair.number;
            while (pair.amount > 1 && num + 1 < a.length) {
                sum += pair.number;
                pair.amount--;
                num++;
            }
        }
        System.out.println(sum);

    }

    public static class Pair {
        public long number;
        public long amount;

        public Pair(long number, long amount) {
            this.number = number;
            this.amount = amount;
        }
    }
}
