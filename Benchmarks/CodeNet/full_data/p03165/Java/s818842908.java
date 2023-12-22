import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public String findLcs(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
        int[][] dp =new int[m+1][n+1];
        for(int i=1;i<m+1;++i) {
            for(int j=1;j<n+1;++j) {
                if(s1.charAt(i-1)!=s2.charAt(j-1)) {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                } else {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
            }
        }
        StringBuilder lcs = new StringBuilder();
        int p1=m,p2=n;
        while (p1>0&&p2>0) {
            if(s1.charAt(p1-1)==s2.charAt(p2-1)) {
                lcs.append(s1.charAt(p1-1));
                --p1;
                --p2;
            } else {
                if(dp[p1-1][p2]>=dp[p1][p2-1]) {
                    --p1;
                } else {
                    --p2;
                }
            }
        }
        return lcs.reverse().toString();
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        String str1=null;
        Main f = new Main();
        str1=reader.readLine();
        String str2=reader.readLine();
        System.out.println(f.findLcs(str1,str2));
    }

}
