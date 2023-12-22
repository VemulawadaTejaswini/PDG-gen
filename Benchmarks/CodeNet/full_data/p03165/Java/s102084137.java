import java.util.*;
import java.io.*;

//atcoder need change class name to Main
//F - LCS
//refer to http://www.mathcs.emory.edu/~cheung/Courses/323/Syllabus/DynProg/LCS-2.html

//https://atcoder.jp/contests/dp/tasks/dp_f

//tabular (bottom-up) dynamic programming

public class Main {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 
    public static void main(String[] args) throws IOException {
  
        String s = next(); 
        String t = next(); 
 
        int[][] dp = new int[s.length()+1][t.length()+1]; 
        char[] s_List = s.toCharArray();
        char[] t_List = t.toCharArray();
        
        // if you make a array create final string, it will TLE
        String[][] finalString = new String[s.length()+1][t.length()+1]; 
        boolean DoYouWantToTLE = false;
        // Initialize to 0
        if(DoYouWantToTLE){
            for (int i=0; i<=s.length();  i++) {
                finalString[i][0] = "";
            }
            for (int j=0; j<=t.length();  j++) {
                finalString[0][j] = "";
            }
        }
        
        for (int i=1; i<=s.length();  i++) {
            for (int j=1; j<=t.length();  j++) {
                if ( s_List[i-1] == t_List[j-1] )
                {
                    dp[i][j] = dp[i-1][j-1] + 1;
                    if(DoYouWantToTLE){
                        finalString[i][j] = finalString[i-1][j-1] + s_List[i-1];
                    }
                }
                else
                {
                    dp[i][j] = Math.max (dp[i-1][j], dp[i][j-1] );
                    if(DoYouWantToTLE){
                        if(dp[i-1][j]> dp[i][j-1] ){
                            finalString[i][j] = finalString[i-1][j];
                        }
                        else{
                            finalString[i][j] = finalString[i][j-1];
                        }
                    }
                }
            }
        }

        if(!DoYouWantToTLE){
            //backwards
            int i = s_List.length; 
            int j = t_List.length;

            char[] finalChar = new char[dp[s.length()][t.length()] ]; 

            while(0<i && 0<j) { 
                if(dp[i-1][j] != dp[i][j] && dp[i][j] != dp[i][j-1])
                { 
                    finalChar[dp[i][j]-1] = s_List[i-1]; //s_List[i] or t_List[j] is same
                    i--; j--; 
                } 
                else if(dp[i-1][j] < dp[i][j-1]) { 
                    j--; 
                } 
                else { 
                    i--; 
                } 
            }
            System.out.println(new String(finalChar));
        }
        else{
            System.out.println(finalString[s.length()][t.length()] );
        }

    }
    

    public static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
}