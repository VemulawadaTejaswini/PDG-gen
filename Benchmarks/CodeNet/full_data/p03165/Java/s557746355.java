import java.util.*;
import java.io.*;
   

public class Main {
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        String t = br.readLine();
        String s = br.readLine();
        int [][] dp = new int[t.length()+1][s.length()+1];
        for(int i=0;i<=t.length();i++){
            for(int j=0;j<=s.length();j++){
                if(i==0||j==0)
                dp[i][j] = 0;
                else if(t.charAt(i-1)==s.charAt(j-1)){
                    dp[i][j]= Math.max(dp[i][j-1]+1, dp[i-1][j]);
                }else{
                    dp[i][j]= Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
    
        System.out.println(dp[t.length()][s.length()]);
    }
}