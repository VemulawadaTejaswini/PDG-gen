import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static String res="";
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] arr1 = reader.readLine().toCharArray();
        char[] arr2 = reader.readLine().toCharArray();
        String[][] dp = new String[arr1.length][arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(dp[i][j]==null) dp[i][j]="";
                if(arr1[i]==arr2[j]){
                    if(i-1>=0 && j-1>=0)dp[i][j] = dp[i-1][j-1]+arr1[i];
                    else dp[i][j] = arr1[i]+"";

                }
                else{
                    if(j-1>=0 && i-1>=0){
                        dp[i][j] = dp[i-1][j].length()>=dp[i][j-1].length()?dp[i-1][j]:dp[i][j-1];
                    }
                    else if(i-1>=0) dp[i][j] = dp[i-1][j];
                    else if(j-1>=0) dp[i][j] = dp[i][j-1];
                    else continue;
                }
            }
        }
        System.out.println(dp[arr1.length-1][arr2.length-1]);
        //solve(arr1,arr2,0,0,"");
        //System.out.println(res);
    }
    public static void solve(char[] arr1,char[] arr2,int i, int j ,String r){
        if(i==arr1.length || j==arr2.length){
            if(r.length()>res.length()) res=r;
        }
        else if(arr1[i]==arr2[j]){
            r=r+arr1[i];
            solve(arr1,arr2,i+1,j+1,r);
        }
        else {
            solve(arr1,arr2,i+1,j,r);
            solve(arr1,arr2,i,j+1,r);
        }
    }
}
