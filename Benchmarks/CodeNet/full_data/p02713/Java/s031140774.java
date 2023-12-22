import java.util.*;

public class Main {
  private static int max(int i,  int j, int k) {
    int max = 0;
    if (i >= j && i >= k) {
      return i;
    }
    if (j >= i && j >= k) {
      return k;
    }
    if (k >= j && k >= i) {
      return k;
    }
    return 1;
  }
  private static long  gcd(int i,  int j, int k) {
    int maxNum = max(i, j, k);
    while (maxNum > 0) {
      if (
        i % maxNum == 0 &&
        j % maxNum == 0 &&
        k % maxNum == 0
      )
        return maxNum;
      maxNum --;
    }
    return 1;
  }
  private static long solve(int n) {
    long result = 0;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        for (int k = 1; k <= n; k++) {
          if (i == j && j == k) {
            result += i;
          } else {
            result += gcd(i, j, k);
          }
        }
      }
    }
    return result;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(solve(sc.nextInt()));
    sc.close();
  }
}

