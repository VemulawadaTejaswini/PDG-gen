
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n + 1];
        int[] b = new int[n];

        for (int i = 0; i < n + 1; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        int rem = 0;
        int totalDefeated = 0;

        for (int i = 0; i < a.length; i++) {
            int defeated = Math.min(rem + (i == n ? 0 : b[i]), a[i]);
            totalDefeated += defeated;
            if (i < n)
                rem = Math.max(0, b[i] + rem - a[i]);
        }

        System.out.println(totalDefeated);

    }
}
