import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int x = scanner.nextInt();

        final int[] distances = new int[n];
        for (int i = 0; i < n; i++) {
            distances[i] = Math.abs(scanner.nextInt() - x);
        }

        if (distances.length == 1) {
            System.out.println(distances[0]);
            return;
        }

        int res = euclidean(distances[0], distances[1]);
        for (int i = 2; i < n; i++) {
            res = euclidean(res, distances[i]);
        }

        System.out.println(res);
    }

    public static int euclidean(int x, int y) {
        int tmp;
        while ((tmp = x % y) != 0) {
            x = y;
            y = tmp;
        }
        return y;
    }

}
