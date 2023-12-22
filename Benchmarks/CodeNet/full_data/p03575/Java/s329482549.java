import java.util.Scanner;
 
public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int list[][] = new int[N+1][N+1];
    for (int i =0; i<M; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      list[a][b] = 1;
      list[b][a] = 1;
    }
    
    boolean seen = true;
    int result =0;
    while (seen) {
      seen = false;
      for (int i =1; i<=N; i++) {
        int count =0;
        for (int j =1; j<=N; j++) {
          if (list[i][j] == 1) count++;
        }
        if (count == 1) {
          result++;
          seen = true;
          for (int j =1; j<=N; j++) {
            list[i][j] =0;
            list[j][i] =0;
          }
        }
      }
    }
    System.out.println(result);
  }
}