
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] P = new int[N];
        for (int i = 0; i < N; i++) P[i] = sc.nextInt();

        int[] sortedFrom = new int[N];
        sortedFrom[0] = 0;

        for (int i = 1; i < N; i++) {
            if (P[i] < P[i - 1]) sortedFrom[i] = i;
            else sortedFrom[i] = sortedFrom[i - 1];
        }

        int[] min = new int[N];     // minimum of last k
        int[] max = new int[N];     // maximum of last k

        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < K; i++) {
            while (!queue.isEmpty() && P[i] > P[queue.peekLast()]) queue.pollLast();
            queue.addLast(i);
        }

        for (int i = K; i < N; i++) {
            max[i - 1] = P[queue.peekFirst()];
            while (!queue.isEmpty() && queue.peekFirst() <= i - K) queue.pollFirst();
            while (!queue.isEmpty() && P[i] > P[queue.peekLast()]) queue.pollLast();
            queue.addLast(i);
        }

        max[N - 1] = P[queue.peekFirst()];

        queue = new ArrayDeque<>();

        for (int i = 0; i < K; i++) {
            while (!queue.isEmpty() && P[i] < P[queue.peekLast()]) queue.pollLast();
            queue.addLast(i);
        }

        for (int i = K; i < N; i++) {
            min[i - 1] = P[queue.peekFirst()];
            while (!queue.isEmpty() && queue.peekFirst() <= i - K) queue.pollFirst();
            while (!queue.isEmpty() && P[i] < P[queue.peekLast()]) queue.pollLast();
            queue.addLast(i);
        }

        min[N - 1] = P[queue.peekFirst()];

        int sol = 0;
        for (int i = K - 1; i < N; i++) {
            if (i - sortedFrom[i] >= K - 1) {
                sol = 1;
                break;
            }
        }
        int i = 0;

        while (i + K - 1 < N) {
            if (sortedFrom[i + K - 1] <= i) {
                i++;
                continue;
            }
            if (P[i] != min[i + K - 1]) {
                sol++;
                i++;
                continue;
            }
            if (i + K >= N) {
                sol++;
                break;
            }
            if (P[i + K] != max[i + K]) {
                sol++;
                i++;
                continue;
            }
            i++;
        }

        System.out.println(sol);
    }
}
