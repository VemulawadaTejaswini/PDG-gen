import java.util.Scanner;

public class Main {
    static String max(String a, String b){
        if(a.length() > b.length())
            return a;
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        String[][] dp = new String[s.length()+1][t.length()+1];

        for(int i = 0; i < t.length()+1; i++){
            dp[0][i] = "";
        }

        for(int i = 0; i < s.length()+1; i++){
            dp[i][0] = "";
        }

        for(int i = 1; i < s.length()+1; i++){
            for(int j = 1; j < t.length()+1; j++){
                dp[i][j] = max(dp[i-1][j],dp[i][j-1]);
                if(s.charAt(i-1) == t.charAt(j-1))
                    dp[i][j] = max(dp[i][j],dp[i-1][j-1]+s.charAt(i-1));
            }
        }

        System.out.println(dp[s.length()][t.length()]);
    }
}
