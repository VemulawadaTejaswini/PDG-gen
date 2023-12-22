import java.util.*;

class Main {

    String s;
    String t;

    private void run() {

        Scanner sc = new Scanner(System.in);
        s = sc.next();
        t = sc.next();

        int S = s.length();
        int T = t.length();

        String[][] dp = new String[S+1][T+1];

        for (int i = 0; i <= S; i++) {
            for (int j = 0; j <= T; j++) {
                if (i == 0 || j == 0) dp[i][j] = ""; 
                else if (s.charAt(i-1) == t.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1] + "" + s.charAt(i-1);
                else if (dp[i-1][j].length() > dp[i][j-1].length())
                    dp[i][j] = dp[i-1][j];
                else 
                    dp[i][j] = dp[i][j-1];
            }
        }

        System.out.println(dp[S][T]);
    }


    public static void main(String[] args) {
        Main solver = new Main();
        solver.run();
    }
}
