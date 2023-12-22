import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            String S = sc.nextLine();
            String T = sc.nextLine();
        sc.close();

        //int[][] dp = new int[S.length()+1][T.length()+1];
        String[][] dp2 = new String[S.length()+1][T.length()+1];

        for(String[] row: dp2)
        Arrays.fill(row, "");

        for(int i = 0 ; i < S.length(); i++){
            boolean flag = false;
            for(int j = 0 ; j < T.length(); j++){
                if(S.charAt(i) == T.charAt(j)){
                    //dp[i+1][j+1] = dp[i][j] + 1;
                    dp2[i+1][j+1] = dp2[i][j] + S.charAt(i);
                    flag = true;
                }else if(flag){
                    //dp[i+1][j+1] = dp[i+1][j];
                    dp2[i+1][j+1] = dp2[i+1][j];
                }
                else{
                    //dp[i+1][j+1] = dp[i][j+1];
                    dp2[i+1][j+1] = dp2[i][j+1];
                }
            }
        }

        System.out.println(dp2[S.length()][T.length()]);
        //System.out.println(sb.toString());
        /*
        for(int i = 0 ; i <= S.length(); i++){
            for(int j = 0 ; j <= T.length(); j++){
                System.out.print(dp2[i][j] + " , ");
            }
            System.out.println("/");
        }
        */

        
    }
}
