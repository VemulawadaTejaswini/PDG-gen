import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    boolean[][] b = new boolean[m][n];
    int[] p = new int[m];
    int ans = 0;

    for(int i = 0; i < m; i++){
      int k = sc.nextInt();
      for(int j = 0; j < k; j++){
        int s = sc.nextInt();
        b[i][s - 1] = true;
      }
    }

    for(int i = 0; i < m; i++){
      p[i] = sc.nextInt();
    }

    for(int i = 0; i < (1 << n); i++){
      int tmp2 = 0;
      for(int l = 0; l < m; l++){
        int tmp = 0;
        for(int j = 0; j < n; j++){
          if(((1 & i >> j) == 1) && (b[l][j] == true)){
            tmp += 1;
          }
        }
        if(tmp % 2 == p[l]){
          tmp2 += 1;
        }
      }
      if(tmp2 == m){
        ans += 1;
      }
    }

    System.out.println(ans);
  }
}
