import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = in.nextInt();

        PriorityQueue<Double> q = new PriorityQueue<>();
        for (int i : arr)
            q.offer(1.0 * i);

        while (q.size() > 1) {
            double x = q.poll();
            double y = q.poll();

            q.offer((x + y) / 2);
        }

        System.out.println(q.poll());
    }

}