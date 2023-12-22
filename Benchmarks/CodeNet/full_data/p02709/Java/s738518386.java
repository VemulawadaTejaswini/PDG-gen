
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

class Pair implements Comparable<Pair> {
    int pos;
    long value;
    Pair(int pos, long value) {
        this.pos = pos;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return pos == pair.pos &&
                value == pair.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pos, value);
    }

    @Override
    public int compareTo(Pair o) {
        return Long.compare(this.value, o.value);
    }
}
public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Pair [] a = new Pair[n];
        for (int i = 0; i < n; ++i) {
            a[i] = new Pair(i, scanner.nextLong());
        }
        Arrays.sort(a, Collections.reverseOrder());
        long[][] dp = new long[n + 1][n + 1];
        dp[1][0] = a[0].value * a[0].pos;
        dp[0][1] = a[0].value * (n - 1 - a[0].pos);
        for (int i = 1; i < n; ++i) {
            for (int left = 0; left <= i; ++left) {
                int right = i - left;
                dp[left + 1][right] = Math.max(
                        dp[left + 1][right],
                        dp[left][right] + a[i].value * Math.abs(a[i].pos - left)
                );
                dp[left][right + 1] = Math.max(
                        dp[left][right + 1],
                        dp[left][right] + a[i].value * Math.abs(a[i].pos - (n - right - 1))
                );
            }
        }
        long ans = 0;
        for (int left = 0; left <= n; ++left) {
            ans = Math.max(ans, dp[left][n - left]);
        }
        System.out.print(ans);
    }
}
