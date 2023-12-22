import java.util.*;
public class Main {

  public static int N;
  public static int M;
  public static int[] k;
  public static int[][] s;
  public static int[] p;
  public static int[] status;
  public static int count;

  public static void main (String[] args) {
	
    Scanner sc = new Scanner(System.in);
    
    N = sc.nextInt();
    M = sc.nextInt();
    
    k = new int[M];
    s = new int[M][];

    p = new int[M];

    status = new int[N];

    for (int i = 0; i < M; i++) {
      
      k[i] = sc.nextInt();
      s[i] = new int[k[i]];
      
      for (int j = 0; j < k[i]; j++) {
        s[i][j] = sc.nextInt();
      }

    }

    for (int i = 0; i < M; i++) {
      p[i] = sc.nextInt();
    }

    sc.close();

    count = 0;

    dfs(0, status);

    System.out.println(count);
 
  }

  public static void dfs(int i, int[] status){

    if (i == N) {

      int check = 0;

      for (int j = 0; j < M; j++) {
        int on = 0;
        
        for (int k = 0; k < s[j].length; k++) {
          int l = s[j][k] - 1;
          if (status[l] == 1) {
            on++;
          }
        }
        if (on % 2 == p[j]){
          check++;
        }
      }

      if (check == M){
        count++;
      }

      return;

    }

    status[i] = 0;
    dfs(i+1, status);

    status[i] = 1;
    dfs(i+1, status);
    
  }

}