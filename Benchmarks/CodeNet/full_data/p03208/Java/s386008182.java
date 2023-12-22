import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int N = sc.nextInt();
        int K = sc.nextInt();
        PriorityQueue<Integer> maxes = new PriorityQueue<>(K, (x, y) -> x - y);
        PriorityQueue<Integer> mins = new PriorityQueue<>(K, (x, y) -> y - x);
        for (int i = 0; i < N; i++) {
            int h = sc.nextInt();
            if (maxes.size() >= K) {
                if (h > Collections.min(maxes)) {
                    maxes.poll();
                    maxes.add(h);
                }
            } else {
                maxes.add(h);
            }

            if (mins.size() >= K) {
                if (h < Collections.max(mins)) {
                    mins.poll();
                    mins.add(h);
                }
            } else {
                mins.add(h);
            }
        }

        System.out.println(Math.min(Collections.max(maxes) - Collections.min(maxes),
                Collections.max(mins) - Collections.min(mins)));
    }
}