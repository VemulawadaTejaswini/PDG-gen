import java.util.*;
import java.math.*;
public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfNumber = scanner.nextInt() + 1;
        int[] numbers = new int[numOfNumber];
        for (int i = 0; i < numOfNumber; i++) {
            numbers[i] = scanner.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numOfNumber; i++) {
            if (map.containsKey(numbers[i]) == false) {
                map.put(numbers[i], 1);
            }
            else {
                map.put(numbers[i], map.get(numbers[i]) + 1);
            }
        }
        int dup = 0;
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                dup = key;
                break;
            }
        }
        int minIndex = -1;
        int maxIndex = -1;
        for (int i = 0; i < numOfNumber; i++) {
            if (numbers[i] == dup) {
                if (minIndex >= 0) {
                    maxIndex = i;
                }
                else {
                    minIndex = i;
                }
            }
        }
        int d = maxIndex - minIndex + 1;
        int[][] dp = new int[numOfNumber + 1][numOfNumber + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) {
                    dp[i][j] = 1;
                }
                else {
                    dp[i][j] = (dp[i - 1][j] + dp[i - 1][j - 1]) % 1000000007;
                }
            }
        }
        for (int k = 1; k <= numOfNumber; k++) {
            int res1 = dp[numOfNumber][k];
            int res2 = dp[numOfNumber - d][k - 1];
            res1 -= res2;
            res1 += 1000000007;
            res1 %= 1000000007;
            System.out.println(res1);
        }

    }
}