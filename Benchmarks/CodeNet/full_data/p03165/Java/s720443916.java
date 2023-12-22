import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s  = scan.nextLine();
        String t = scan.nextLine();

        String[][] dp = new String[s.length()+1][t.length()+1];
        for(int row = 0 ; row <= s.length() ; row++) {
            dp[row][0] = "";
        }
        for(int col = 0 ; col <= t.length() ; col++) {
            dp[0][col] = "";
        }
        for(int row = 1 ; row <= s.length() ; row++) {
            for(int col = 1 ; col <= t.length() ; col++) {
                if(s.charAt(row-1) == t.charAt(col-1)){
                    dp[row][col] = dp[row-1][col-1]+s.charAt(row-1);
                } else {
                    if(dp[row-1][col].length() > dp[row][col-1].length()){
                        dp[row][col] = dp[row-1][col];
                    } else {
                        dp[row][col] = dp[row][col-1];
                    }
                }
            }
        }
        System.out.println(dp[s.length()][t.length()]);
    }
}