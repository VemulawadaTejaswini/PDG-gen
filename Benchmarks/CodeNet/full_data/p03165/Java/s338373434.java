import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader in;

    public static void solve() throws IOException {
        String s= in.readLine().trim();
        String t = in.readLine().trim();

        int slen = s.length();
        int tlen = t.length();

        int[][] dp = new int[tlen+1][slen+1];

        for(int i = 0;i<slen;i++){
            dp[0][i] = 0;
        }
        for(int i =0;i<tlen;i++){
            dp[i][0] = 0;
        }

        for(int i = 1;i<= tlen;i++){
            for(int j = 1;j<=slen ;j++){
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                if(t.charAt(i-1) == s.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
            }
        }




//        for(int[] arr : dp){
//            System.out.println(Arrays.toString(arr));
//        }
        StringBuilder ans = new StringBuilder();
        int i = tlen,j= slen;
        while(dp[i][j]!=0){
            if(t.charAt(i-1) == s.charAt(j-1)) {
                ans.insert(0, t.charAt(i - 1));
                i--;
                j--;
            }
            else if(dp[i-1][j] > dp[i][j-1]){
                i--;
            }
            else{
                j--;
            }
        }

        System.out.println(ans.toString());




    }




    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        solve();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(in.readLine().trim());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(in.readLine().trim());
    }

    static Integer[] nextArray(int n) throws IOException {
        StringTokenizer st = new StringTokenizer(in.readLine());
        Integer[] tmp = new Integer[n];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = Integer.parseInt(st.nextToken());
        }

        return tmp;
    }

}

