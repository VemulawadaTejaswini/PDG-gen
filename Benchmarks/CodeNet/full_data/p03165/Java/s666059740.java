
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int x = s.length()+1;
        int y = t.length()+1;
        int[][] dp = new int[x][y];
        for(int i = 0; i<x;i++){
            for(int j = 0; j<y;j++){
                if(i==0||j==0){
                    dp[i][j] = 0;
                } else if (s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        StringBuilder sol = new StringBuilder();
        int i = x-1;
        int j = y-1;
        while(true){
            if(i<=0||j<=0)
                break;
            if(s.charAt(i-1)==t.charAt(j-1)){
                sol.insert(0, Character.toString(s.charAt(i-1)));
                i--;
                j--;
            } else if(dp[i][j]==dp[i][j-1]){
                j--;
            } else if(dp[i][j]==dp[i-1][j]){
                i--;
            }

        }
        System.out.println(sol.toString());

    }
}
