import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        Deque<Long> que = new ArrayDeque<>();
        for (long i=1; i<10; i++) {
            que.add(i);
        }
        int count = 0;
        long x;
        while (true) {
            x = que.poll();
            count++;
            if (count == K) {
                break;
            }
            if (x % 10 != 0) {
                que.add(10 * x + (x % 10) - 1);
            }
            que.add(10 * x + (x % 10));
            if (x % 10 != 9) {
                que.add(10 * x + (x % 10) + 1);
            }
        }
        System.out.println(x);
    }
}