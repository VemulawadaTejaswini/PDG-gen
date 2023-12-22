import java.io.*;
import java.util.*;
import java.lang.Math.*;

class Main{

    static String[][] dp = new String[3001][3001];

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
    
        String s = new String();
        String t = new String();

        s = sc.next();
        t = sc.next();

        int sLen = s.length();
        int tLen = t.length();

        for(int i = 0; i < 3001; i++){
            dp[0][i] = "";
            dp[i][0] = "";
        }

        for(int i = 1; i <= sLen; i++){
            for(int j = 1; j <= tLen; j++){
                String temp1 = dp[i-1][j];
                char c = s.charAt(i-1);
                int k;
                for(k = j-1; k > -1; k--){
                    if( c == t.charAt(k) ) break;
                }
                if(k > -1){
                    String temp2 = (dp[i-1][k+1] + c);
                    if(temp1.length() < temp2.length()){
                        dp[i][j] = temp2;                    
                    }
                    else dp[i][j] = temp1;
                }
                else{
                    dp[i][j] = dp[i-1][j]; 
                }
            }
        }
        
        System.out.println( dp[sLen][tLen] );
        
        sc.close();
    }
}
