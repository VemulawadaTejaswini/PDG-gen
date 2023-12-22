import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] ary = new int[n][3];
        for(int i = 0; i < n; i++){
            String line = sc.nextLine();
            String[] line1 = line.split(" ");
            ary[i][0] = Integer.parseInt(line1[0]);
            ary[i][1] = Integer.parseInt(line1[1]);
            ary[i][2] = Integer.parseInt(line1[2]);
        }
        int[] dp = new int[n];
        for(int i = 0; i < n; i++)  dp[i] = 0;
        int max = 0;
        for(int i = 0; i < 3; i++){
            dp[0] = ary[0][i];
            for(int j = 1; j < n; j++){
                for(int k = 0; k < 3; k++){
                    if(i != k){
                        dp[j] = Math.max(dp[j], dp[j - 1] + ary[j][k]);
                    }
                }
            }
            if(max < dp[n - 1]) max = dp[n - 1];
        }
        
        System.out.println(max);
    }
}