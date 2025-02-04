import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static long[] X, Y, R;

  public static void main(String[] args) {
    long SX = sc.nextLong();
    long SY = sc.nextLong();
    long TX = sc.nextLong();
    long TY = sc.nextLong();
    int N = sc.nextInt();
    X = new long[N];
    Y = new long[N];
    R = new long[N];
    for (int i = 0; i < N; i++) {
      X[i] = sc.nextInt();
      Y[i] = sc.nextInt();
      R[i] = sc.nextInt();
    }
    double[][] dist = new double[N + 2][N + 2];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < i; j++) {
        long d = dist2(X[i], Y[i], X[j], Y[j]);
        long r2 = (R[i] + R[j]) * (R[i] + R[j]);
        if (d > r2) {
          dist[i][j] = dist[j][i] = Math.sqrt(d) - (R[i] + R[j]);
        }
      }
    }
    for (int i = 0; i < N; i++) {
      dist[N][i] = dist[i][N] = Math.max(0, Math.sqrt(dist2(SX, SY, X[i], Y[i])) - R[i]);
      dist[N + 1][i] = dist[i][N + 1] = Math.max(0, Math.sqrt(dist2(TX, TY, X[i], Y[i])) - R[i]);
    }
    dist[N][N + 1] = dist[N + 1][N] = Math.sqrt(dist2(SX, SY, TX, TY));

    double[] minDist = new double[N + 2];
    boolean[] visited = new boolean[N + 2];
    Arrays.fill(minDist, 1e300);
    minDist[N] = 0;
    for (int i = 0; i < N + 2; i++) {
      int pos = -1;
      double minD = 1e300;
      for (int j = 0; j < N + 2; j++) {
        if (!visited[j] && minDist[j] < minD) {
          minD = minDist[j];
          pos = j;
        }
      }
      visited[pos] = true;
      for (int j = 0; j < N + 2; j++) {
        minDist[j] = Math.min(minDist[j], minDist[pos] + dist[pos][j]);
      }
    }

    System.out.printf("%.10f\n", minDist[N + 1]);
  }

  static long dist2(long x1, long y1, long x2, long y2) {
    return (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
  }

}
