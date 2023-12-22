
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long [] health = new long[n];
        PriorityQueue<Long> healths = new PriorityQueue<>();

        for (int i = 0; i < n; ++i) {
            health[i] = scanner.nextLong();
            healths.add(health[i]);

        }
        long min1 = healths.poll();
        long min2 = healths.poll();
        for (int i = 0; i < n; ++i) {
            health[i] %= min1;
        }
        for (int i = 0; i < n; ++i) {
            if (health[i] != 0 && (min2 > health[i] || min2 % min1 == 0)) {
                min2 = health[i];
            }
        }

  //      System.out.println("min1: " + min1 + " min2: " + min2);
        while (min1 >= 1 && min2 >= 1) {
            if (min1 > min2) {
                long tmp = min1;
                min1 = min2;
                min2 = tmp;
            }
            if (min2 % min1 == 0) {
                System.out.println(min1);
                return;
            }
            min2 = min2 % min1;
        }
        System.out.println(Math.min(min1, min2));


    }

}
