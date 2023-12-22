import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Main {

    public static int frog2(int[] arr, int k) {
        if(arr == null || arr.length == 0) {
            return 0;
        }
        int[] dp = new int[arr.length];

        for(int i = 1; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            for(int j = 1; j <= Math.min(i, k); j++) {
                min = Math.min(min, dp[i - j] + Math.abs(arr[i] - arr[i - j]));
            }
            dp[i] = min;
        }
        return dp[arr.length - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] arr = new int[n];
        int i = 0;
        while(sc.hasNextInt()) {
            arr[i] = sc.nextInt();
            i++;
        }
        
        System.out.println(frog2(arr, k));
  }
}
