import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        System.out.println(new Main().f(s, t));
    }

    public String f(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[][] dp = new int[m+1][n+1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = m, j = n;
        while(i > 0 && j > 0){
            if(s.charAt(i-1) == t.charAt(j-1)){
                sb.append(s.charAt(i-1));
                i--;
                j--;
            }else{
                if(dp[i-1][j] >= dp[i][j-1]){
                    i--;
                }else{
                    j--;
                }
            }
        }
        return sb.reverse().toString();
    }
}
