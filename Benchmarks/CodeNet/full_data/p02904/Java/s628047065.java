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
        int sol = 0;

        int[] min = new int[N]; // minimum of next k
        int[] max = new int[N]; // maximum of next k

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


        for (int i = 0; i < N; i++) {
        }
        for (int i = 0; i < N; i++) {
            if (i + K + 1 >= N) break;
            sol++;
            int j = i;
            while (j + K < N && P[j] == min[j + K - 1] && P[j + K] == max[j + K]) j++;
            i = j;
        }
        System.out.println(sol + 1);
    }
}