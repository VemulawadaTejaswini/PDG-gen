import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[][] A = new int[3][3];
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        A[i][j] = sc.nextInt();
      }
    }
    int N = sc.nextInt();
    int[] b = new int[N];
    for(int n = 0; n < N; n++){
      b[n] = sc.nextInt();
      for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
          if(A[i][j] == b[n]){
            A[i][j] = 0;
          }
        }
      }
    }
    String ans = "No";
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        if((A[i][0] == 0 && A[i][1] == 0 && A[i][2] == 0) || (A[0][j] == 0 && A[1][j] == 0 && A[2][j] == 0) || (A[0][0] == 0 && A[1][1] == 0 && A[2][2] == 0)){
          ans = "Yes";
        }
      }
    }
    System.out.println(ans);
  }
}
