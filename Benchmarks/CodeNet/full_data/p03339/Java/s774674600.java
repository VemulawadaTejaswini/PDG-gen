import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int[] wSum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            wSum[i] = wSum[i - 1];
            if (s[i - 1] == 'W') {
                wSum[i]++;
            };
        }
        
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int turnToE = wSum[i - 1];
            int turnToW = n - i - (wSum[n] - wSum[i]);
            ans = Math.min(ans, turnToE + turnToW);
        }
        System.out.println(ans);
    }
}
