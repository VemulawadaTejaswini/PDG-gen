import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++)
      a[i] = sc.nextInt();
    sc.close();

    int K = 3;
    int[] c = new int[K + 1];
    for (int i = 0; i < N; i++) c[a[i]]++;

    double[][][] mm = new double[N + 1][N + 1][N + 1];
    double ans = f(mm, c);
    System.out.println(ans);
  }

  private static double f(double[][][] mm, int[] c) {
    if (mm[c[1]][c[2]][c[3]] != 0) return mm[c[1]][c[2]][c[3]];

    double fsum = 0;
    int csum = 0;
    for (int i = c.length - 1; 0 < i; i--) {
      if (c[i] == 0) continue;
      c[i]--;
      c[i - 1]++;
      double f = f(mm, c);
      c[i - 1]--;
      c[i]++;
      fsum += f * c[i];
      csum += c[i];
    }
    if (csum == 0) return 0d;
    double ans = (fsum + c[0] + csum) / csum;

    mm[c[1]][c[2]][c[3]] = ans;
    return ans;
  }
}