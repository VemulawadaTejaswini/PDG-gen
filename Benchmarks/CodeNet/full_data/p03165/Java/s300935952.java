import java.nio.charset.IllegalCharsetNameException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s = in.next();
        String t = in.next();

        int n = s.length();
        int m = t.length();

        int[][] dp = new int[n + 1][m + 1];



        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= m; j++) {


                if (i == 0 || j == 0) dp[i][j] = 0;

                else if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    //System.out.println(s.charAt(i-1)+" "+t.charAt(j-1)+" "+i+" "+j);
                    dp[i][j] = dp[i-1][j-1]+1;
                } else {

                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);

                }


            }


        }


//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= m; j++) {
//                System.out.print(dp[i][j] + " ");
//            }
//
//            System.out.println();
//
//        }

        StringBuffer lcs = new StringBuffer("");
        int i=n, j = m;
        while(i>0 && j>0) {
            if(s.charAt(i-1) == t.charAt(j-1)) {
                i--;j--;
                lcs.append(s.charAt(i));
            }
            else if(dp[i-1][j] > dp[i][j-1]) i-- ;
            else j--;
        }
        System.out.println(lcs.reverse().toString());
    }
}