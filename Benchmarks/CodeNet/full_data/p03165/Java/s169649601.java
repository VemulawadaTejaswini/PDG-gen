import java.util.Scanner;

public class AtCoder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        String[][] dp = new String[s.length()+1][t.length()+1];
        for(int i=0;i<=s.length();i++){
            dp[i][0]="";
        }
        for(int i=0;i<=t.length();i++){
            dp[0][i]="";
        }

        for(int i=1 ; i<= s.length() ; i++ ){
            char ci = s.charAt(i-1);
            for(int j=1 ; j<= t.length() ; j++ ){
                char cj = t.charAt(j-1);
                if(ci == cj){
                    dp[i][j]=dp[i-1][j-1]+ci+"";
                }else{
                    if(dp[i][j-1].length()>=dp[i-1][j].length()){
                        dp[i][j]=dp[i][j-1];
                    }else{
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
        }

        System.out.println(dp[s.length()][t.length()]);



    }
}
