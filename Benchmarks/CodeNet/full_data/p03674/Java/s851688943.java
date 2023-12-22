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
        int[] dp = new int[(numOfNumber + 1) / 2 + 1];
        int[] dp2 = new int[(numOfNumber - d + 1) / 2 + 1];
        dp2[0] = 1;
        dp[0] = 1;
        for (int i = 1; i < numOfNumber + 1; i++) {
            for (int j = Math.min(i - 1, dp.length - 1); j > 0; j--) {
                dp[j] = dp[j] + dp[j - 1];
                dp[j] %= 1000000007;
            }
            if (i < dp.length) {
                dp[i] = 1;
            }
            if (i == numOfNumber - d) {
                for (int j = 0; j < dp2.length; j++) {
                    dp2[j] = dp[j];
                }
            }
        }
        for (int k = 1; k <= numOfNumber; k++) {
            int res1 = k < dp.length ? dp[k] : dp[numOfNumber - k];
            int res2 = k - 1 < dp2.length ? dp2[k - 1] : (numOfNumber - d - k + 1 < dp2.length && numOfNumber - d - k + 1 >= 0 ? dp2[numOfNumber - d - k + 1] : 0);
            res1 -= res2;
            res1 %= 1000000007;
            res1 += 1000000007;
            res1 %= 1000000007;
            System.out.println(res1);
        }
    }
}