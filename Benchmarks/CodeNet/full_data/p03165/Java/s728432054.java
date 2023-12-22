import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        String[] S = s.split("");
        String[] T = t.split("");
        
        int slen = S.length;
        int tlen = T.length;
        int[][] dp = new int[slen+1][tlen+1];

        String les = "";
        
        int N;
        if(S.length >= T.length) {
            N = T.length;
        }else {
            N = S.length;
        }
        
        for(int i = 1; i <= slen; i++) {
            for(int j = 1; j <=tlen; j++) {
                dp[i][j] = max(dp[i][j], dp[i-1][j]);
                dp[i][j] = max(dp[i][j], dp[i][j-1]);
                if(S[i-1].equals(T[j-1])) {
                    dp[i][j] = max(dp[i][j], dp[i-1][j-1] + 1);
                }
            }
            
        }
    
        int i = slen;
        int j = tlen;
        while(i > 0 && j > 0) {
            if(dp[i][j] == dp[i-1][j]) {
                i--;
            }else if(dp[i][j] == dp[i][j-1]) {
                j--;
            }else {
                i--;
                j--;
                les = S[i] + les;
            }
        }
        
        System.out.println(les);
    }
    
    public static long max(long a, long b) {
        if(a >= b) {
            return a;
        }else {
            return b;
        }
    }
    
    public static int max(int a, int b) {
        if(a >= b) {
            return a;
        }else {
            return b;
        }
    }
    
    public static long min(long a, long b) {
        if(a >= b) {
            return b;
        }else {
            return a;
        }
    }
    
    public static int min(int a, int b) {
        if(a >= b) {
            return b;
        }else {
            return a;
        }
    }
}