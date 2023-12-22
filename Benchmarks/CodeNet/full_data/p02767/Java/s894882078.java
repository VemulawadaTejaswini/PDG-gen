import java.util.Scanner;

public class Main {

    private static int stamina(int x, int p) {
        return (x - p) * (x - p);
    }

    private static int minStamina(int[] xs) {
        int minP = 0;
        int maxP = 100;
        int min = Integer.MAX_VALUE;

        for (int p = minP; p <= maxP; p++) {
            int totalStamina = 0;

            for (int x : xs) {
                totalStamina += stamina(x, p);
            }

            min = Math.min(totalStamina, min);
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] xs = new int[n];

        for (int i = 0; i < n; i++) {
            xs[i] = sc.nextInt();
        }

        System.out.println(minStamina(xs));
    }
}