import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int n = Integer.parseInt(line1[0]);
        int k = Integer.parseInt(line1[1]);
        String line2 = sc.nextLine();
        String[] line3 = line2.split(" ");
        int[] ary = new int[n];
        for(int i = 0; i < n; i++)  ary[i] = Integer.parseInt(line3[i]);
        int[] dp = new int[n];
        double d1 = Double.POSITIVE_INFINITY;
        for(int i = 0; i < n; i++)  dp[i] = (int)d1;
        dp[0] = 0;
        if(ary[0] > ary[1]) dp[1] = ary[0] - ary[1];
        else    dp[1] = ary[1] - ary[0];
        for(int i = 2; i < n; i++){
            for(int j = 0; j <= k; j++){
                int a = i - k;
                if(i - k < 0)   a = 0;
                if(i == j)  break;
                if(dp[i] >= dp[a + j] + absoluteValue(ary[a + j], ary[i])){
                    dp[i] = dp[a + j] + absoluteValue(ary[a + j], ary[i]);
                }
            }
        }
        System.out.println(dp[n - 1]);
    }
    static int absoluteValue(int a, int b){
        if(a > b)   return a - b;
        else    return b - a;
    }
}