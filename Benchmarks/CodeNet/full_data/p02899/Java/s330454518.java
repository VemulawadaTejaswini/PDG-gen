import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    static class Pair {
        int left;
        int right;
        Pair(int l, int r) {
            left = l;
            right = r;
        }
    }

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        PriorityQueue<Pair> pq = new PriorityQueue<>(n, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.right - o2.right;
            }
        });
        for (int i = 0; i < n; i++) {
            int a = std.nextInt();
            pq.add(new Pair(i + 1, a));
        }

        List<Integer> sorted = new ArrayList<>();
        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            sorted.add(p.left);
        }

        String results = sorted.stream().map(Object::toString).collect(Collectors.joining(" "));
        System.out.println(results);
    }
}
