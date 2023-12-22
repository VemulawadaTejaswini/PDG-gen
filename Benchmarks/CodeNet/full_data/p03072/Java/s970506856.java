

import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        try (final Scanner sc = new Scanner(System.in)) {
            final int n = sc.nextInt();
            final int[] h = new int[n];
            int result = 0;
            int max = 0;
            for (int i = 0; i < n; i++) {
                h[i] = sc.nextInt();
                if (i == 0 || max <= (h[i])) {
                    result += 1;
                }
                max = Math.max(max, h[i]);
            }
            System.out.println(result);
        }
    }
}
