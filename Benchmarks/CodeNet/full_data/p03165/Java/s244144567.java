import java.util.Scanner;

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
        for(int row = s.length() ; row > 0 ;) {
            for(int col = t.length() ; col > 0 ;) {
                if(s.charAt(row-1) == t.charAt(col-1)){
                   sb.append(s.charAt(row-1));
                   row--;
                   col--;
                } else {
                    if(dp[row-1][col] > dp[row][col-1]) {
                        row--;
                    } else {
                        col--;
                    }
                }
            }
        }

        //reconstruct the sequence now. 

        System.out.println(sb.reverse().toString());
    }
}
