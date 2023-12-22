import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        PriorityQueue<Long> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++)
            q.add(sc.nextLong());
        for (int i = 0; i < m; i++)
            q.add(q.poll() / 2);

        long ans = 0;
        for (long x : q)
            ans += x;

        System.out.println(ans);
        sc.close();
    }
}
