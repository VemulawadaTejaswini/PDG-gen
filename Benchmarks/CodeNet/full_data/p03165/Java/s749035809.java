import java.util.Scanner;

public class Main {
    static public void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        int[][] dp = new int[s.length()+1][t.length()+1];

        for(int i = 0 ; i < s.length() ; i++){
            for(int j = 0 ; j < t.length() ; j++){
                if(s.charAt(i) == t.charAt(j)){
                    dp[i+1][j+1] = dp[i][j] + 1;
                }else{
                    if(dp[i+1][j] >= dp[i][j+1]){
                        dp[i+1][j+1] = dp[i+1][j];
                    }else{
                        dp[i+1][j+1] = dp[i][j+1];
                    }
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        int[] pos = {s.length(), t.length()};
        while(dp[pos[0]][pos[1]] > 0){
            if(dp[pos[0]][pos[1]] == dp[pos[0]][pos[1] - 1]){
                pos[1]--;
            }else if(dp[pos[0]][pos[1]] == dp[pos[0]-1][pos[1]]){
                pos[0]--;
            }else{
                ans.append(s.charAt(pos[0]-1));
                pos[0]--;
                pos[1]--;
            }
        }

        System.out.println(ans.reverse().toString());
    }
}
