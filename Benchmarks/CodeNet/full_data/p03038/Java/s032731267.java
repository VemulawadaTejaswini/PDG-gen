

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Long> A = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();
            A.offer(num);
        }


        for (int i = 0; i < m; i++) {
            int b = sc.nextInt();
            long c = sc.nextLong();
            for (int j = 0; j < b; j++) {
                A.offer(c);
            }
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A.poll();
        }
        System.out.println(sum);
    }
}
