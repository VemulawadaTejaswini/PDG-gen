import java.util.Scanner; 

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int[] A = new int[N];
 
      for (int i = 0; i < A.length; ++i) {
        A[i] = in.nextInt();
      }

      int[] gcdBefore = new int[N];
      gcdBefore[0] = 0;
//      gcdBefore[1] = A[0];
      for (int i = 1; i < gcdBefore.length; ++i) {
        gcdBefore[i] = gcd(gcdBefore[i - 1], A[i - 1]);
      }

      int[] gcdAfter = new int[N];
      gcdAfter[gcdAfter.length - 1] = 0;
 //     gcdAfter[gcdAfter.length - 2] = A[A.length - 1];
      for (int i = gcdAfter.length - 2; i >= 0; --i) {
        gcdAfter[i] = gcd(gcdAfter[i + 1], A[i + 1]);
      }

      int ans = -1;
      for (int i = 0; i < A.length; ++i) {
        ans = Math.max(ans, gcd(gcdBefore[i], gcdAfter[i]));
      }

      System.out.println(ans);
    }
  }

  private static int gcd (int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
  }
}