import java.util.Scanner;

public class Main {
    static public void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        int[][] dp = new int[2][t.length()+1];

        for(int i = 0 ; i < s.length() ; i++){
            for(int j = 0 ; j < t.length() ; j++){
                if(s.charAt(i) == t.charAt(j)){
                    dp[(i+1)%2][j+1] = dp[i%2][j]++;
                }else{
                    if(dp[(i+1)%2][j] >= dp[i%2][j+1]){
                        dp[(i+1)%2][j+1] = dp[(i+1)%2][j];
                    }else{
                        dp[(i+1)%2][j+1] = dp[i%2][j+1];
                    }
                }
            }
        }

        System.out.println(dp[s.length()%2][t.length()]);
    }
}
