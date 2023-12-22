import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int[][] order = new int[N+1][N];
    for(int i = 1; i <= N; i++){
      for(int j = 1; j <= N-1; j++){
        order[i][j] = Integer.parseInt(sc.next());
      }
    }

    int[] M = new int[N+1];
    for(int i = 1; i <= N; i++){
      M[i] = 1;
    }
    int ans = 0;
    int count = 0;
    boolean flag = true;
    boolean[] c = new boolean[N+1];
    while(count < N*(N-1)){
      flag = true;
      for(int i = 1; i <= N; i++){
        int n = order[i][M[i]];
        if(i == order[n][M[n]]){
          flag = false;
          c[i] = true;
          
        }
      }
        
      for(int j = 1; j <= N; j++){
        if(c[j]){
          c[j] = false;
          count++;
          M[j]++;
          if(M[j] == N){
            M[j] = 0;
          }
        }
      }
      if(flag){
        System.out.println(-1);
        return;
      }
      ans++;
    }
    System.out.println(ans);
  }
}