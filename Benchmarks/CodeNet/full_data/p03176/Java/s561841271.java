
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long t = currentTimeMillis();
        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::valueOf).toArray();
        int[] p   = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::valueOf).toArray();

        //out.println(currentTimeMillis()-t);
        long[] dp =new long[n];
        dp[0]=0;
        long max = 0;
        for (int i = 0; i < n; i++) {
            long maxVal=0;
            for (int j = 0; j < i; j++) {
                if(arr[i]>arr[j]){
                    maxVal = Math.max(maxVal,dp[j]);
                }
            }
            dp[i] = maxVal+p[i];
            max= Math.max(max,dp[i]);
        }
        System.out.println(max);
        //out.println(currentTimeMillis()-t);
    }
}
