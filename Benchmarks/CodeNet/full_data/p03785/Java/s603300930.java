import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by zzt on 17-3-12.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        int k = scanner.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = scanner.nextInt();
        }
        Arrays.sort(t);
        int result = 1;
        int curMinT = t[0];
        int curP = 0;
        for (int i = 0; i < n; i++) {
            if (curP == 0) {
                curMinT = t[i];
            }
            if (t[i] - curMinT <= k) {
                curP++;
            } else {
                if (i != n - 1)
                    result++;
                curMinT = t[i];
                curP = 0;
                continue;
            }
            if (curP == c) {
                if (i != n - 1)
                    result++;
                curP = 0;
            }
        }
        System.out.println(result);
    }
}