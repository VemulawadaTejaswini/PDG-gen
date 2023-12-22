import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        
        // 入力情報
        String s = sc.next();
        String t = sc.next();
        
        // dp[i][j] : s[i : s.length()]と t[j : t.length()]のLCS
        String[][] dp = new String[s.length() + 1][t.length() + 1];
        
        
        // 片方が空文字列なら結果も空文字列
        for(int i = 0; i <= s.length(); i ++) dp[i][t.length()] = "";
        for(int j = 0; j <= t.length(); j ++) dp[s.length()][j] = "";
        
        for(int i = s.length() - 1; i >= 0; i --){
            for(int j = t.length() - 1; j >= 0; j --){
                String str;
                if (s.charAt(i) == t.charAt(j)) str = s.charAt(i) + dp[i+1][j+1];
                else{
                    int len1 = dp[i+1][j].length();
                    int len2 = dp[i][j+1].length();
                    str = (len1 < len2) ? dp[i][j+1] : dp[i+1][j];
                }
                dp[i][j] = str;
            }
        }
        // 出力
        System.out.print(dp[0][0]);
    }
}