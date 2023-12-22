import java.util.*;
public class Main{
    public static Scanner scanner = new Scanner(System.in);
    public static int[][] dp =  new int[3001][3001];
    public static void main(String[] args){
        String s = scanner.nextLine();
        String c = scanner.nextLine();
       System.out.println(solve(s , c));
    }

    public static int Lcslen(String s , String c , int i , int j){

        int slen = s.length();
        int clen = c.length();

        if( i >= slen || j >= clen){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(s.charAt(i) == c.charAt(j) ){
            return dp[i][j] =  1 + Lcslen(s , c , i + 1 , j + 1);
        }
        else {
            return dp[i][j] = Math.max(Lcslen(s , c , i + 1 , j) , Lcslen(s , c , i , j + 1));

        }
    }
        public static String solve(String s , String c){
           for(int row[] : dp){
            Arrays.fill(row , -1);}
            int len = Lcslen(s , c , 0 , 0);
            return getLcs(s,c,len);
        }

        public static String getLcs(String s , String c , int len){
        int i = 0;
        int j = 0;
        String lcs = "";
        while(len > 0){
            if(s.charAt(i) == c.charAt(j)){
                lcs += s.charAt(i);
                i++;
                j++;
                len--;
            }
            else
            {
                if(dp[i][j + 1] > dp[i + 1][j])
                    j++;
                else
                    i++;
            }
        }
        return lcs;
        }
    }

