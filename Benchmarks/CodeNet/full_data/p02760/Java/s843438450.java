import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ans = "No";
    int[][] A = new int[3][3];
    for(int i = 0;i < 3;i++){
      for(int j = 0;j < 3;j++){
        A[i][j] = sc.nextInt();
      }
    }
    int N = sc.nextInt();
    for(int j = 0;j < N;j++){
      int b = sc.nextInt();
      for(int i = 0;i < 3;i++){
        for(int k = 0;k < 3;k++){
          if(b == A[i][k]){
            A[i][k] = 0;
          }
        }
      }
    }

    for(int i = 0;i < 3;i++){
      if(A[i][0] == A[i][1] && A[i][0] == A[i][2]){
        ans = "Yes";
      }else if(A[0][i] == A[1][i] && A[1][i] == A[2][i]){
        ans = "Yes";
      }
    }
    if(A[0][0] == A[1][1] && A[1][1] == A[2][2]){
      ans = "Yes";
    }else if(A[0][2] == A[1][1] && A[1][1] == A[2][0]){
      ans = "Yes";
    }
    System.out.print(ans);
  }
}