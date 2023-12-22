import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Collections;
import java.awt.Point;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + 1;
            
            for (int j = 1; Math.pow(6, j) <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i-(int)Math.pow(6, j)]+1);
            }
            
            for (int j = 1; Math.pow(9, j) <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i-(int)Math.pow(9, j)]+1);
            }
        }
        
        System.out.println(dp[n]);
    }
}

