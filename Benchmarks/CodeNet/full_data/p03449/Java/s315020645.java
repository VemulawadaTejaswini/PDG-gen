import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] A = new int[3][N+1];
    for(int row=1; row<=2;row++){
      for(int col=1;col<=N;col++){
        A[row][col] = sc.nextInt();
      }
    }
    int[][] record = new int[3][N+2];
    for(int col=N;col>=1;col--){
      record[2][col] = A[2][col] + record[2][col+1];
    }
    for(int col=1;col<=N;col++){
      record[1][col] = record[1][col-1] + A[1][col];
    }
    int max = Integer.MIN_VALUE;
    for(int i=1;i<=N;i++){
      int cur = record[1][i]+record[2][i];
      max = Math.max(cur,max);
    }
    System.out.println(max);
  }
}
