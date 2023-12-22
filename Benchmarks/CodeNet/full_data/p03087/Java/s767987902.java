import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int quesNum = sc.nextInt();
        String input = sc.next();

        Dp dp = new Dp(len, input);
        
        for(int i = 0; i < quesNum; i++){
            int ans = 0;
            int left = sc.nextInt();
            int right = sc.nextInt();
          
            ans = dp.part(left, right);
            System.out.println(ans);
        }
    }
}

class Dp {
    static int[][] dp;
    String input;
    public Dp (int num, String input) {
        dp = new int[num+1][num+1];
        for(int i = 0; i <= num; i++) {
            for(int j = 0; j <= num; j++) {
                dp[i][j] = -1;
            }
        }
        this.input = input;
    }

    public int part(int left, int right) {
        if(dp[left][right] != -1)return dp[left][right];
        
        if(right-left <= 0) {
            dp[left][right] = 0;
            return dp[left][right];
        }
        
        int ans = 0;
        if(input.charAt(left-1) == 'A' && input.charAt(left) == 'C') {
            ans = part(left+2, right) + 1;
        }
        else if(input.charAt(right-2) == 'A' && input.charAt(right-1) == 'C') {
            ans = part(left, right-2) + 1;
        }
        else ans = part(left+1, right-1);

        dp[left][right] = ans;
        return dp[left][right];
    }
}