import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Problem.problemF_LCS();
    }
}

class Problem {
    static void problemF_LCS() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int n = s.length(), m = t.length();
        int[][] DP = new int[n+1][m+1];
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= m; j++) {
                if (s.charAt(i-1) == t.charAt(j-1))
                    DP[i][j] = DP[i - 1][j - 1] + 1;
                else
                    DP[i][j] = Math.max(DP[i - 1][j], DP[i][j - 1]);
            }
        }

        // retrieve the string
        int i = n, j = m;
        StringBuilder ans = new StringBuilder();
        while (i > 0 && j > 0) {
            if (DP[i][j] == DP[i][j-1])
                j--;
            else if (DP[i][j] == DP[i-1][j])
                i--;
            else {
                ans.append(s.charAt(i-1));
                i--; j--;
            }
        }
        System.out.println(ans.reverse().toString());
    }

}