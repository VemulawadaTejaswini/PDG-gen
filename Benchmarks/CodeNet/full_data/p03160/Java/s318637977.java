

import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {

        try (final Scanner sc = new Scanner(System.in)) {
            final int n = sc.nextInt();
            final int[] h = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                h[i] = sc.nextInt();
            }
            final int[] step = new int[n + 1];
            for (int i = 2; i <= n; i++) {
                int plus1 = Math.abs(h[i - 1] - h[i]) + step[i - 1];
                int plus2 = Math.abs(h[i - 2] - h[i]) + step[i - 2];
                step[i] = Math.min(plus1, plus2);
            }
            System.out.println(step[n]);
        }
    }

}
