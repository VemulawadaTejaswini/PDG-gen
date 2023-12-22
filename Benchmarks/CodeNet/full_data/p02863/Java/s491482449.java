import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int A = Integer.parseInt(S[0]);
    int B = Integer.parseInt(S[1]);
    int[][] food = new int[A][2];
    for(int i = 0; i < A; i++){
      String[] T = sc.nextLine().split(" ");
      food[i][0] = Integer.parseInt(T[0]);
      food[i][1] = Integer.parseInt(T[1]);
    }
    
    Arrays.sort(food, (a, b)->Integer.compare(a[1], b[1]));
    int[][] dp = new int[A+1][B+1];
    for(int i = 0; i < A-1; i++){
      for(int j = 0; j <= B; j++){
        if(j < food[i][0]){
          dp[i+1][j] = dp[i][j];
        }else{
          dp[i+1][j] = Math.max(dp[i][j-food[i][0]]+food[i][1], dp[i][j]);
        }
      }
    }
    System.out.println(dp[A-1][B]+food[A-1][1]);
  }
}