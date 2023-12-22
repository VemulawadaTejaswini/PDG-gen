import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] stones = new int[n];
        for (int i = 0; i < n; i++) {
            stones[i] = scanner.nextInt();
        }
        System.out.println(minInjured(stones, n - 1));
    }

    public static int minInjured(int[] stones, int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return Math.abs(stones[1] - stones[0]);
        }

        return Math.min(minInjured(stones, n - 1) + Math.abs(stones[n] - stones[n - 1]),
                minInjured(stones, n - 2) + Math.abs(stones[n] - stones[n - 2]));
    }

}