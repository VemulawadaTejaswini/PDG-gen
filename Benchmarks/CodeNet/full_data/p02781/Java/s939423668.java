import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        int l = str.length();
        int[] value = new int[l];
        
        for (int i = 0; i < l; i++) {
            value[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        
        
        int[][][] dp = new int[101][2][k+1];
        dp[0][0][0] = 1;  //初期条件。他は0で初期化されている
        for (int i = 0; i < l; i++){
            for (int smaller = 0; smaller < 2; smaller++){
                for (int j = 0; j < k; j++){
                    for (int x = 0; x <= ((smaller == 1) ? 9 : value[i]); x++){
                        // [j || hoge] の部分が条件
                        if (x != 0) {
                            if ((smaller == 1) || x < value[i]) {
                                dp[i + 1][1][j + 1] += dp[i][smaller][j];  
                            } else {
                                dp[i + 1][0][j + 1] += dp[i][smaller][j];  
                            }
                        } else {
                            if ((smaller == 1) || x < value[i]) {
                                dp[i + 1][1][j] += dp[i][smaller][j];  
                            } else {
                                dp[i + 1][0][j] += dp[i][smaller][j];  
                            }
                        }  
                    }
                }
            }
        }
        
        System.out.println(dp[l][0][k] + dp[l][1][k]);
        System.out.println(dp[1][0][0]);
        System.out.println(dp[1][0][1]);
        System.out.println(dp[1][1][0]);
        System.out.println(dp[1][1][1]);
    }
}
