import java.util.Scanner;

public class Main {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        int[][] dp = new int[s.length()+1][t.length()+1];
        int[][][] parent = new int[s.length()+1][t.length()+1][2];

        for(int i=1 ; i<= s.length() ; i++ ){
            char ci = s.charAt(i-1);
            for(int j=1 ; j<= t.length() ; j++ ){
                char cj = t.charAt(j-1);
                if(ci == cj){
                    dp[i][j]=dp[i-1][j-1]+1;
                    int[] p = new int[2];
                    p[0]=i-1;p[1]=j-1;
                    parent[i][j]= p;
                }else{
//                    System.out.println("[i][j]="+i+" "+j +" dp[i][j-1]="+dp[i][j-1] + " dp[i-1][j]="+dp[i-1][j]);
                    if(dp[i][j-1]>=dp[i-1][j]){
                        dp[i][j]=dp[i][j-1];
                        int[] p = new int[2];
                        p[0]=i;p[1]=j-1;
                        parent[i][j]= p;
                    }else{
                        dp[i][j]=dp[i-1][j];
                        int[] p = new int[2];
                        p[0]=i-1;p[1]=j;
                        parent[i][j]= p;
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
            }
            int[] p =parent[i][j];
            i=p[0];
            j=p[1];
        }
        System.out.println(sb.toString());

    }
}
