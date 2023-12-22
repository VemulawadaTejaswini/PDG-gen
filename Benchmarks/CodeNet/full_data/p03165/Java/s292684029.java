import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s  = scan.nextLine();
        String t = scan.nextLine();

        int[][] dp = new int[s.length()+1][t.length()+1];
        for(int row = 0 ; row <= s.length() ; row++) {
            dp[row][0] = 0;
        }
        for(int col = 0 ; col <= t.length() ; col++) {
            dp[0][col] = 0;
        }
        for(int row = 1 ; row <= s.length() ; row++) {
            for(int col = 1 ; col <= t.length() ; col++) {
                if(s.charAt(row-1) == t.charAt(col-1)){
                    dp[row][col] = dp[row-1][col-1]+1;
                } else {
                    dp[row][col] = Math.max(dp[row-1][col], dp[row][col-1]);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int row = s.length();
        int col = t.length();
        for( ; row > 0 && col > 0;) {
            if(dp[row][col] == dp[row-1][col]){
                row--;
            } else if(dp[row][col] == dp[row][col-1]){
                col--;
            } else {
                sb.append(s.charAt(row-1));
                row--;
                col--;
            }
        }
        System.out.println(sb.reverse().toString());
    }
}
