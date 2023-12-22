
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] num = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        int [] a = new int[m];
        for (int i = 0; i < m; ++i) {
            a[i] = scanner.nextInt();
        }
        String [] dp = new String[n + 1];
        String res = "";
        for (int j = 0; j <= n; ++j) {
            dp[j] = "";
        }
        for (int i = 0; i < m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (i == 0) {
                    if (j % num[a[0]] == 0) {
                        dp[j] = String.join("", Collections.nCopies(j / num[a[0]], String.valueOf(a[0])));
                    }
                } else {
                    for (int k = 1; k * num[a[i]] <= j; ++k) {
                        if (!dp[j - num[a[i]] * k].isEmpty()
                        || j == num[a[i]] * k) {
                            String newStr = dp[j - num[a[i]] * k] +
                                    String.join("", Collections.nCopies(k, String.valueOf(a[i])));

                            dp[j] = getMax(dp[j], newStr);
                        }

                    }
                }
                if (j == n && !dp[j].isEmpty()) {
                    res = getMax(res, dp[j]);
                }
            }
        }
        int [] digits = new int[10];
        for (int i = 0; i < res.length(); ++i) {
            digits[res.charAt(i) - '0']++;
        }
        String sorted = "";
        for (int i = 9; i >= 1; --i) {
            sorted += String.join("", Collections.nCopies(digits[i], String.valueOf(i)));
        }
        System.out.println(sorted);

    }

    static String getMax(final String a, final String b) {
        if (a.length() > b.length()) {
            return a;
        } else if (a.length() < b.length()) {
            return b;
        } else {
            int [] numA = new int[10];
            int [] numB = new int[10];
            for (int i = 0; i < a.length(); ++i) {
                numA[a.charAt(i) - '0']++;
                numB[b.charAt(i) - '0']++;
            }
            for (int i = 9; i >= 1; --i) {
                if (numA[i] > numB[i]) {
                    return a;
                } else if (numA[i] < numB[i]) {
                    return b;
                }
            }
            return a;
        }
    }
}
