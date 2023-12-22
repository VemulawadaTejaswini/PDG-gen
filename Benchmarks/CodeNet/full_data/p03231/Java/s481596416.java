/**
 * Created at 10:25 on 2019/03/05
 */

import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int N = sc.nextInt();
    int M = sc.nextInt();
    String S = sc.next();
    String T = sc.next();

    long L = lcm(N, M);
    int g = gcd(N, M);
    int intervalS = (int)(L / M);
    int intervalT = (int)(L / N);

    for (int i=0; i<g; i++) {
      if (S.charAt(intervalS*i) != T.charAt(intervalT*i)) {
        System.out.println(-1);
        return;
      }
    }

    System.out.println(L);

  }

  static long lcm(long a, long b) {
    long ans = 1;
    for (long i=2; i<=a*b; i++) {
      if (i % a == 0 && i % b == 0) {
        ans = i;
        break;
      }
    }
    return ans;
  }

  static int gcd(int a, int b) {
    int ans = 1;
    int min = Math.min(a, b);
    for (int i=2; i<=min; i++) {
      if (a % i == 0 && b % i == 0) {
        ans = i;
      }
    }
    return ans;
  }

}