

import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {

        try (final Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] V = new int[N];
            int max = 0;
            for (int i = 0; i < N; i++) {
                V[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                int profit = V[i] - sc.nextInt();
                if (profit > 0) {
                    max += profit;
                }
            }
            System.out.println(max);
        }
    }
}
