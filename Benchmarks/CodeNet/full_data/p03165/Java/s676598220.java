import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        int[][] dp = new int[s.length()+1][t.length()+1];
        for(int i=1 ; i<= s.length() ; i++ ){
            char ci = s.charAt(i-1);
            for(int j=1 ; j<= t.length() ; j++ ){
                char cj = t.charAt(j-1);
                if(ci == cj){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
//                    System.out.println("[i][j]="+i+" "+j +" dp[i][j-1]="+dp[i][j-1] + " dp[i-1][j]="+dp[i-1][j]);
                    if(dp[i][j-1]>=dp[i-1][j]){
                        dp[i][j]=dp[i][j-1];
                    }else{
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
        }
//        System.out.println(dp[s.length()][t.length()]);

        int i=s.length();
        int j=t.length();
        StringBuilder sb = new StringBuilder();
        while(i>0 && j>0){
            char ci= s.charAt(i-1);
            char cj=t.charAt(j-1);
            if(ci==cj){
                sb.insert(0,ci);
                i--;
                j--;
            }else if(dp[i][j] ==dp[i][j-1]){
                j--;
            }else{
                i--;
            }
        }
        System.out.println(sb.toString());

    }
}
