import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by AMK on 8/27/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main {
    static int n;
    private static int memo[] = new int[100005];
    private static int arr[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.fill(memo, -1);
        memo[1] = 0;
        memo[2] = Math.abs(arr[1] - arr[2]);
        for (int i = 3; i <= n; i++) {
            memo[i] = Math.min(memo[i - 2] + Math.abs(arr[i] - arr[i - 2]),
                    memo[i - 1] + Math.abs(arr[i] - arr[i - 1]));
        }
        System.out.println(memo[n]);
    }

    private static int Calc(int i, int cost) {
        if (i == 0) {
            return cost;
        }
        if (i < 0) {
            return Integer.MAX_VALUE;
        }
//        if (memo[i] != -1) {
//            return memo[i];
//        }
        int res = Math.min(Calc(i - 1, i >= 1 ? cost + Math.abs(arr[i] - arr[i - 1]) :
                        Integer.MAX_VALUE),
                Calc(i - 2, i >= 2 ? cost + Math.abs(arr[i] - arr[i - 2]) : Integer.MAX_VALUE));
        memo[i] = res;
        if (i > 0)
            System.out.println(i + " " + res);
        return res;
    }
}
