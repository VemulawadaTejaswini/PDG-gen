import java.util.*;

public class Main{
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      
      int[][] array = new int[N][2];
      for (int i = 0; i < N; ++i) {
          // i番目のx座標
          array[i][0] = sc.nextInt();
          // i番目のy座標
          array[i][1] = sc.nextInt();
      }
      
      double total = 0.0d;
      
      // 全道の長さの和を求める
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          if (i == j) continue;
          total += Math.sqrt(nijo(array[i][0] - array[j][0]) + nijo(array[i][1] - array[j][1]));
        }
      }
      
      System.out.println(total / N);
      
    }
  
  private static int nijo(int x) { return x * x;}
}