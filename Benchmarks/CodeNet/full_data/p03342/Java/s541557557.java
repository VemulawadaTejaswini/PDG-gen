import java.util.Arrays;
import java.util.Scanner;

/**
 * Solution for AtCoder Regular Contest 098.
 * Problem available at: https://arc098.contest.atcoder.jp/tasks/arc098_b
 *
 * @author ryosuke
 */
public class Main {

    public static int countMatches(int n, int[] arr) {
        int count = 0;
        int[] lens = new int[n];

        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int j = i + 1;
            while (j < n && (tmp ^ arr[j]) == (tmp | arr[j])) {
                tmp ^= arr[j];
                j++;
            }
            lens[i] = j - i;
        }
        for (int len : lens) {
            count += len;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = countMatches(n, arr);
        System.out.println(res);
        sc.close();
    }
}
