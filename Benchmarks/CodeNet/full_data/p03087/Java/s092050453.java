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
          
            ans = dp.part(right) - dp.part(left);
            System.out.println(ans);
        }
    }
}

class Dp {
    static int[] dp;
    String input;
    public Dp (int num, String input) {
        dp = new int[num+1];
        for(int i = 0; i <= num; i++) {
            dp[i] = -1;  
        }
        this.input = input;
    }

    public int part(int right) {
        if(dp[right] != -1)return dp[right];
        
        if(right <= 1) {
            dp[right] = 0;
            return dp[right];
        }
        
        int ans = 0;
        if(input.charAt(right-2) == 'A' && input.charAt(right-1) == 'C') {
            ans = part(right-2) + 1;
        }
        else ans = part(right-1);

        dp[right] = ans;
        return dp[right];
    }
}