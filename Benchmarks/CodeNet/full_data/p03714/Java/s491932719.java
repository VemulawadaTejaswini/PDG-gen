import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;
import java.util.Queue;
import java.util.PriorityQueue;

public class Main {

    static int N;
    static long[] a;
    static long answer;
    static long leftSum[];
    static long rightSum[];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        a = new long[3 * N];
        leftSum = new long[N + 1];
        rightSum = new long[N + 1];
        Queue<Long> left = new PriorityQueue<Long>();
        Queue<Long> right = new PriorityQueue<Long>(Collections.reverseOrder());
        Deque<Long> disposedRight = new ArrayDeque<Long>();


        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextLong();
            if (i < N) {
                left.add(a[i]);
            }
            else if (2 * N <= i){
                right.add(a[i]);
            }
        }

        sc.close();

        leftSum[0] = sum(left);
        for (int i = N; i < 2 * N; i++) {
            left.add(a[i]);
            leftSum[i - (N - 1)] = leftSum[i - N] + a[i] - left.poll();
        }

        rightSum[0] = sum(right);
        for (int i = 2 * N - 1; i >= N; i--) {
            right.add(a[i]);
            rightSum[2 * N - 1 - (i - 1)] = rightSum[2 * N - 1 - i] + a[i] - right.poll();
        }

        for (int i = 0; i < N  + 1; i++) {
            answer = Math.max(answer, leftSum[i] - rightSum[N - i]);
        }

        System.out.println(answer);
    }

    private static long sum(Queue<Long> queue) {
        return queue.stream().mapToLong(x -> (long)x).sum();
    }
}



