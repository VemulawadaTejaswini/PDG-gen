import java.util.*;

public class Main {
  public static void main(String[] args) {
    int N, D;
    int[][] X;
    try(Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
      D = sc.nextInt();
      X = new int[N][D];
      for(int i = 0; i < N; i++) {
        X[i] = new int[D];
        for(int d = 0; d < D; d++) {
          X[i][d] = sc.nextInt();
        }
      }
    }
    int count = 0;
    for(int i = 0; i < N; i++) {
      for(int j = i+1; j < N; j++) {
        int rSquared = 0;
        for(int d = 0; d < D; d++) {
          int diff = X[i][d] - X[j][d];
          rSquared += diff * diff;
        }
        double r = Math.sqrt(rSquared);
        if ( isOk(r) ) {
          count++;
        }
      }
    }
    System.out.println(count);
  }
  
  private static boolean isOk(double value) {
    int intValue = (int)Math.floor(value);
    return value == (double)intValue;
  }
}