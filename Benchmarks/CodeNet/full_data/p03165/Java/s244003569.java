import java.util.*;
import java.io.*;
import java.lang.*;

 class Main{
    
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder("");
    static StringTokenizer stk = new StringTokenizer("");

    public static void main(String args[]){
        try{
            String s = bf.readLine();
            String t = bf.readLine();
            solver(s,t);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void solver(String s, String t){
        int[][] dp = new int[s.length()][t.length()];
        String[][] lcs = new String[s.length()][t.length()];

        for(int i=0;i<s.length();i++){ //for string s
            for(int j=0;j<t.length();j++){//for string t
                lcs[i][j] = "";
                if(s.charAt(i) == t.charAt(j)){
                    dp[i][j] = 1 + ((i-1 >= 0 && j-1 >= 0) ? dp[i-1][j-1] : 0);
                    lcs[i][j] += ((i-1 >= 0 && j-1 >= 0) ? lcs[i-1][j-1] : "") + s.charAt(i);
                }else{

                    if(i-1 >=0 && j-1 >= 0){
                        if(dp[i-1][j] > dp[i][j-1]){
                            dp[i][j] = dp[i-1][j];
                            lcs[i][j] += lcs[i-1][j];
                        }else{
                            dp[i][j] = dp[i][j-1];
                            lcs[i][j] += lcs[i][j-1];
                        }
                    }else if(i-1 >= 0 && j-1 < 0){
                        dp[i][j] = dp[i-1][j];
                        lcs[i][j] += lcs[i-1][j];
                    }else if(i-1 < 0 && j-1 >= 0){
                        dp[i][j] = dp[i][j-1];
                        lcs[i][j] += lcs[i][j-1];
                    }

                }
                
            }
        }
        
        System.out.println(lcs[s.length()-1][t.length()-1]);
    }

    public static void printDpTable(int[][] dp){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println("");
        }
    }
}