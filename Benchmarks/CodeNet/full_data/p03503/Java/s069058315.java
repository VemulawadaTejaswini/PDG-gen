import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int[][] fs = new int[n][10];
      for(int i = 0; i < n; i++)
        for(int j = 0; j < 10; j++)
          fs[i][j] = sc.nextInt();

      int[][] ps = new int[n][11];
      for(int i = 0; i < n; i++)
        for(int j = 0; j < 11; j++)
          ps[i][j] = sc.nextInt();

      long max = Long.MIN_VALUE;
      for(int i = 1; i < (1 << 10); i++) {
          long profit = 0;
          for(int j = 0; j < n; j++) {
              int cnt = 0;
              for(int k = 0; k < fs[j].length; k++)
                if((fs[j][k] & (i >> k)) == 1) cnt++;
              profit += ps[j][cnt];
          }
          max = Math.max(max, profit);
      }
      System.out.println(max);
  }
}