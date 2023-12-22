import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        String dp[][] = new String[s.length() + 1][t.length() + 1];
        for(int i = 0 ; i <= s.length() ; i++){
            dp[i][0] = "";
        }
        for(int i = 0 ; i <= t.length() ; i++){
            dp[0][i] = "";
        }
        for(int i = 1 ; i <= s.length() ; i++){
            for(int j = 1 ; j <= t.length() ; j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + s.charAt(i-1);
                }else{
                    if(dp[i-1][j].length() > dp[i][j-1].length()){
                        dp[i][j] = dp[i-1][j];
                    }else{
                        dp[i][j] = dp[i][j-1];
                    }
                }
            }
        }
        // for(int i = 0 ; i <= s.length() ; i++){
        //     for(int j = 0 ; j <= t.length() ; j++){
        //         System.out.print(dp[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        System.out.println(dp[s.length()][t.length()]);
        
    }
}