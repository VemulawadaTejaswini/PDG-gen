

import java.util.Scanner;

public class Main {
    static class Solution {
        Integer[][]dp;
        public void find(int k) {
            dp = new Integer[k+1][k+1];
            long res = 0;
            for(int a=1; a<=k; a++) {
                for(int b=1; b<=k; b++) {
                    for(int c=1; c<=k; c++) {
                        int val = gcd(b,c);
                        if(dp[b][c] == null) {
                            dp[b][c] = val;
                        }
                        int val2 = gcd(a, val);
                        if(dp[a][val] == null) {
                            dp[a][val] = val2;
                        }
                        res += val2;
                    }
                }
            }
            System.out.println(res);

        }

        int gcd(int a, int b)
        {
            if(dp[a][b] != null) {
                return dp[a][b];
            }
            // Everything divides 0
            if (a == 0)
                return b;
            if (b == 0)
                return a;

            // base case
            if (a == b)
                return a;

            // a is greater
            if (a > b)
                return gcd(a-b, b);
            return gcd(a, b-a);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        sol.find(k);
    }
}
