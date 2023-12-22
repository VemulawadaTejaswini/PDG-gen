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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        a = new long[3 * N];
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

        for (int i = 2 * N - 1; i >= N; i--) {
            right.add(a[i]);
            disposedRight.push(right.poll());
        }

        long leftSum = sum(left);
        long rightSum = sum(right);
        answer = leftSum - rightSum;
        search(left, right, disposedRight, N, leftSum, rightSum);

        System.out.println(answer);
    }

    private static void search(Queue<Long> left, Queue<Long> right, Deque<Long> disposedRight, int border, long leftSum, long rightSum) {

        left.add(a[border]);
        leftSum += a[border];
        leftSum -= left.poll();

        long backNum = disposedRight.pop();
        if (right.remove((Long)a[border])) {
            right.add(backNum);
            rightSum -= a[border];
            rightSum += backNum;
        }

        if (answer < leftSum - rightSum) {
            answer = leftSum - rightSum;
        }

        if (border + 1 == 2 * N) {
            return;
        }

        search(left, right, disposedRight, border + 1, leftSum, rightSum);
    }

    private static long sum(Queue<Long> queue) {
        return queue.stream().mapToLong(x -> (long)x).sum();
    }
}



