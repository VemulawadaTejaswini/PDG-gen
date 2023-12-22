import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int t = scanner.nextInt();
        final int a = scanner.nextInt();

        final double[] d = new double[n];
        for (int i = 0; i < n; i++) {
            final int h = scanner.nextInt();
            d[i] = Math.abs(a - (t - 0.006 * h));
        }

        int minIndex = 0;
        double minDiff = d[0];
        for (int i = 1; i < n; i++) {
            if (minDiff > d[i]) {
                minDiff = d[i];
                minIndex = i;
            }
        }

        System.out.println(minIndex + 1);
    }

}
