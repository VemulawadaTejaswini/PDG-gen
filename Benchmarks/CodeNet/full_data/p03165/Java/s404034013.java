
import java.util.Scanner;

public class f_lcs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        int[][] dp = new int[s.length()+1][t.length()+1];


        for(int i = 1 ; i <= s.length();i++)
        {
            for(int j = 1 ; j <= t.length() ;j++)
            {
                if(s.charAt(i-1) == t.charAt(j-1))
                {
                    dp[i][j] = dp[i-1][j-1]+1;
                }else
                {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int i = s.length();
        int j = t.length();
        char[] lcs = new char[dp[i][j]];
        int index = lcs.length;
        while (i > 0 && j > 0)
        {
            // If current character in X[] and Y are same, then
            // current character is part of LCS
            if (s.charAt(i-1) == t.charAt(j-1))
            {
                // Put current character in result
                lcs[index-1] = s.charAt(i-1);

                // reduce values of i, j and index
                i--;
                j--;
                index--;
            }
            // If not same, then find the larger of two and
            // go in the direction of larger value
            else if (dp[i-1][j] > dp[i][j-1])
                i--;
            else
                j--;
        }
        StringBuilder b = new StringBuilder();
        for(i  = 0 ; i < lcs.length ;i++)
        {
            b.append(lcs[i]);
        }
        System.out.println(b);

    }
}
