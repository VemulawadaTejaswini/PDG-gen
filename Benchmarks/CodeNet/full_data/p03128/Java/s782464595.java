

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
        BigNumber [] dp = new BigNumber[n + 1];
        BigNumber res = new BigNumber();
        for (int j = 0; j <= n; ++j) {
            dp[j] = new BigNumber();
        }
        for (int i = 0; i < m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (i == 0) {
                    if (j % num[a[0]] == 0) {
                        dp[j] = new BigNumber(a[0], j / num[a[0]]);
                    }
                } else {
                    for (int k = 1; k * num[a[i]] <= j; ++k) {
                        if (!dp[j - num[a[i]] * k].isEmpty
                        || j == num[a[i]] * k) {
                            BigNumber bigNumber = new BigNumber(dp[j - num[a[i]] * k]);
                            bigNumber.addNum(a[i], k);
                            dp[j] = BigNumber.getMax(dp[j], bigNumber);
                        }

                    }
                }
                if (j == n && !dp[j].isEmpty) {
                    res = BigNumber.getMax(res, dp[j]);
                }
            }
        }

        System.out.println(res);

    }

    public static class BigNumber {
        public int[] digits = new int[10];
        public boolean isEmpty = true;

        public BigNumber() {

        }

        public BigNumber(final BigNumber bigNumber) {
            for (int i = 1; i <= 9; ++i) {
                digits[i] = bigNumber.digits[i];
            }
        }

        public BigNumber(int a, int num) {
            digits[a] += num;
            if (num > 0) {
                isEmpty = false;
            }
        }

        public void addNum(int digit, int num) {
            digits[digit] += num;
            if (num > 0) {
                isEmpty = false;
            }
        }


        public static BigNumber getMax(BigNumber a, BigNumber b) {
            for (int i = 9; i >= 1; --i) {
                if (a.digits[i] > b.digits[i]) {
                    return a;
                } else if (a.digits[i] < b.digits[i]) {
                    return b;
                }
            }
            return a;
        }

        public String toString() {
            String sorted = "";
            for (int i = 9; i >= 1; --i) {
                sorted += String.join("", Collections.nCopies(digits[i], String.valueOf(i)));
            }
            return sorted;
        }

    }
}
