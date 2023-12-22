

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static class Solution {

        Long[][]dp;
        public void find(int[][] arr, int n) {
            dp = new Long[n+2][n+2];
            Arrays.sort(arr, (a,b) -> b[0] - a[0]);
            long res = findMax(arr, 1, n, 0);
            System.out.println(res);
        }

        long findMax(int[][] arr, int l, int r, int index) {

            if(l>r) return 0;
            if(index > arr.length-1) return 0;
            if(dp[l][r] != null) return dp[l][r];
            long ans = arr[index][0] * Math.abs(arr[index][1] - l) + findMax(arr, l+1, r, index+1);
            long ans2 = arr[index][0] * Math.abs(arr[index][1] - r) + findMax(arr, l, r-1, index+1);
            return dp[l][r] = Math.max(ans, ans2);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][2];
        for(int i=1; i<=n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = i;
        }
        sol.find(arr, n);
    }
}

