
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int[] length = new int[n];
        for (int i = 0; i < n; ++i) {
            length[i] = scanner.nextInt();
        }
        int res = dfs(length, 0, a, b, c, 0, 0, 0);
        System.out.println(res);

    }

    static int dfs(int [] length, int current, int a, int b, int c, int sumA, int sumB, int sumC) {
        if (current == length.length) {
            if (a != 0 && b != 0 && c != 0) {
                return Math.abs(a - sumA) + Math.abs(b - sumB) + Math.abs(c - sumC) - 30;
            }
            return Integer.MAX_VALUE;
        }
        int res1 = dfs(length, current + 1, a, b, c, sumA, sumB, sumC);
        int res2 = dfs(length, current + 1, a, b ,c,sumA + length[current], sumB, sumC) + 10;
        int res3 = dfs(length, current + 1, a, b, c, sumA,sumB + length[current], sumC) + 10;
        int res4 = dfs(length, current + 1, a, b, c, sumA, sumB, sumC + length[current]) + 10;
        return Math.min(Math.min(res1, res2), Math.min(res3, res4));
    }
}
