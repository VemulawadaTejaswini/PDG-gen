import java.util.*;

public class Main{
  static int p = 1000000007;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int[][] bingo = new int[3][3];
    bingo[0][0] = Integer.parseInt(S[0]);
    bingo[0][1] = Integer.parseInt(S[1]);
    bingo[0][2] = Integer.parseInt(S[2]);
    
    S = sc.nextLine().split(" ");
    bingo[1][0] = Integer.parseInt(S[0]);
    bingo[1][1] = Integer.parseInt(S[1]);
    bingo[1][2] = Integer.parseInt(S[2]);
    
    S = sc.nextLine().split(" ");
    bingo[2][0] = Integer.parseInt(S[0]);
    bingo[2][1] = Integer.parseInt(S[1]);
    bingo[2][2] = Integer.parseInt(S[2]);
    
    boolean[][] check = new boolean[3][3];
    
    int N = sc.nextInt();
    for(int i = 0; i < N; i++){
      int M = sc.nextInt();
      for(int j = 0; j<3; j++){
        for(int k = 0; k < 3; k++){
          if(bingo[j][k] == M){
            check[j][k] = true;
          }
        }
      }
    }
    boolean c1 = check[0][0] && check[0][1] && check[0][2];
    boolean c2 = check[1][0] && check[1][1] && check[1][2];
    boolean c3 = check[2][0] && check[2][1] && check[2][2];
    boolean c4 = check[0][0] && check[1][0] && check[2][0];
    boolean c5 = check[0][1] && check[1][1] && check[2][1];
    boolean c6 = check[0][2] && check[1][2] && check[2][2];
    boolean c7 = check[0][0] && check[1][1] && check[2][2];
    boolean c8 = check[0][2] && check[1][1] && check[2][0];
    System.out.println(c1 || c2 || c3 || c4 || c5 || c6 || c7 || c8 ? "Yes" : "No");
  }
}