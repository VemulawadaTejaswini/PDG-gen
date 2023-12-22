
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[][] memo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        memo = new int[K + 1][K + 1];

        int sum = 0;
        for (int i = 1 ; i <= K ; i++) {
            for (int j = 1 ; j <= K ; j++) {
                for (int k = 1 ; k <= K ; k++) {
                    int[] target = {i, j, k};
                    Arrays.sort(target);
//                    System.out.printf("%d %d %d%n", target[0], target[1], target[2]);
                    sum += gcd(target[2], gcd(target[1], target[0]));
                }
            }
        }
        System.out.println(sum);
    }

    public static int gcd(int a, int b) {
//        System.out.printf("%7d %7d%n", a, b);
        if (memo[a][b] > 0) return memo[a][b];
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
