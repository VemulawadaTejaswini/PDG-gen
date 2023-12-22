import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public long getBalance(int[] A, int L, int R, long[][] memo) {
        // System.out.println(String.format("L: %d, R: %d", L, R));
        if (L == R) {
            return A[L];
        }
        if (memo[L][R] != Long.MIN_VALUE) {
            return memo[L][R];
        }
        long left = A[L] - getBalance(A, L + 1, R, memo);
        long right = A[R] - getBalance(A, L, R - 1, memo);
        long maxHere = Math.max(left, right);
        if (maxHere > memo[L][R]) {
            memo[L][R] = maxHere;
        }
        return memo[L][R];
    }
    public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.readLine();
          	Main app = new Main();
            String[] split = br.readLine().split(" ");
            int n = split.length;
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
               A[i] = Integer.parseInt(split[i]); 
            }
            long[][] memo = new long[n + 1][n + 1];
            for (long[] row: memo) {
                Arrays.fill(row, Long.MIN_VALUE);
            }
            long result = app.getBalance(A, 0, n - 1, memo);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
