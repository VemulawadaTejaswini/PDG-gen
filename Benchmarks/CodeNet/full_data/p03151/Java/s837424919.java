

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextLong();
        }
        for (int i = 0; i < n; ++i) {
            b[i] = scanner.nextLong();
        }
        int lessNum = 0;
        int moreNum = 0;
        long less = 0;
        long more = 0;
        for (int i = 0; i < n; ++i) {
            if (a[i] < b[i]) {
                less += b[i] - a[i];
                ++lessNum;
            }
        }
        if (less == 0) {
            System.out.println(0);
            return;
        }
        PriorityQueue<Long> moreScore = new PriorityQueue<>(
                Comparator.reverseOrder()
        );
        for (int i = 0; i < n; ++i) {
            if (a[i] > b[i]) {
                more += a[i] - b[i];
                moreScore.add(a[i] - b[i]);
            }
        }
        if (more < less) {
            System.out.println(-1);
            return;
        }
        int result = lessNum;
        while (!moreScore.isEmpty() && less > 0) {
            long delta = moreScore.poll();
            less -= delta;
            ++result;
        }


        System.out.println(result);


    }
}
