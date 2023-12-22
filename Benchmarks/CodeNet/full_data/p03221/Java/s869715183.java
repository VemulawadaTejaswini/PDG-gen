import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    static class Pair {
        int first;
        int second;
        int index;
        Pair(int f, int s, int i) {
            first = f;
            second = s;
            index = i;
        }
    }

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int m = std.nextInt();
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.second - o2.second;
            }
        });

        for (int i = 0; i < m; i++) {
            Pair p = new Pair(std.nextInt(), std.nextInt(), i);
            pq.add(p);
        }

        int[] counts = new int[n];

        String[] results = new String[m];

        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            int number = counts[p.first - 1] + 1;
            String res = String.format("%06d%06d", p.first, number);
            counts[p.first - 1]++;
            results[p.index] = res;
        }

        Arrays.stream(results).forEach(System.out::println);
    }
}
