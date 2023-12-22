import java.util.Scanner;
import java.util.Collections;
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


        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextLong();
            if (i < N) {
                left.add(a[i]);
            }
            else if (2 * N <= i) {
                right.add(a[i]);
            }
        }

        sc.close();

        long leftSum = sum(left);
        long rightSum = sum(right);
        answer = -Long.MAX_VALUE;
        search(left, right, N - 1, leftSum, rightSum);

        System.out.println(answer);
    }

    private static void search(Queue<Long> left, Queue<Long> right, int border, long leftSum, long rightSum) {

        Queue<Long> leftCopy = new PriorityQueue<Long>(left);
        Queue<Long> rightCopy = new PriorityQueue<Long>(right);

        long tmpLeftSum = leftSum;
        long tmpRightSum = rightSum;

        for (int i = N; i <= border; i++) {
            leftCopy.add(a[i]);
            tmpLeftSum += a[i];
            tmpLeftSum -= leftCopy.poll();
        }

        for (int i = border + 1; i < 2 * N; i++) {
            rightCopy.add(a[i]);
            tmpRightSum += a[i];
            tmpRightSum -= rightCopy.poll();
        }

        if (answer < tmpLeftSum - tmpRightSum) {
            answer = tmpLeftSum - tmpRightSum;
        }

        if (border + 1 == 2 * N) {
            return;
        }

        search(left, right, border + 1, leftSum, rightSum);
    }

    private static long sum(Queue<Long> queue) {
        return queue.stream().mapToLong(x -> (long)x).sum();
    }
}


