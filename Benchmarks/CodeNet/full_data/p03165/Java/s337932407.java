import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        int dp[][] = new int[str1.length()+1][str2.length()+1];
        for (int i = str1.length()-1; i >= 0; i--) {
            for (int j = str2.length()-1; j >=0; j--) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    dp[i][j] = 1 + dp[i+1][j+1];
                    continue;
                }
                dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
            }
        }
        int i =0, j=0;
        String result = "";
        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) == str2.charAt(j)) {
                result = result + str1.charAt(i);
                i = i+1;
                j = j+1;
                continue;
            }
            if (dp[i+1][j] > dp[i][j+1]) {
                i = i+1;
            } else {
                j = j+1;
            }
        }
        System.out.println(result);
    }
}
