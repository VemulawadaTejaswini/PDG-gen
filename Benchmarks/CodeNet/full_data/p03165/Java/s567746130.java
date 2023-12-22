import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String one = input.nextLine();
        String two = input.nextLine();
        String[][] dp = new String[one.length() + 1][two.length() + 1];
        for(int i = 0; i <= one.length(); i++) {
            for(int k = 0; k <= two.length(); k++) {
                dp[i][k] = "";
            }
        }
        dp[0][0] = "";
        for(int i = 1; i <= one.length(); i++) {
            for(int k = 1; k <= two.length(); k++) {
                String temp = dp[i - 1][k - 1];
                if(one.charAt(i - 1) == two.charAt(k - 1)){
                    temp = new StringBuilder(temp).append(one.substring(i - 1, i)).toString();
                }
                if(temp.length() > dp[i][k].length()) {
                    dp[i][k] = temp;
                }
                if(dp[i - 1][k].length() > dp[i][k].length()) {
                    dp[i][k] = dp[i - 1][k];
                }
                if(dp[i][k - 1].length() > dp[i][k].length()) {
                    dp[i][k] = dp[i][k - 1];
                }
            }
        }
        System.out.println(dp[one.length()][two.length()]);
    }
}
