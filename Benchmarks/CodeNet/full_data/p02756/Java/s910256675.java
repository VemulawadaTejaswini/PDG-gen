import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int Q = sc.nextInt();
    int[] T = new int[Q];
    int[] F = new int[Q];
    char[] C = new char[Q];
    for (int i = 0; i < Q; i++) {
      T[i] = sc.nextInt();
      if (T[i] == 2) {
        F[i] = sc.nextInt();
        C[i] = sc.next().charAt(0);
      }
    }
    sc.close();

    char[] pre = new char[Q];
    char[] suf = new char[Q];
    int preB = Q - 1;
    int sufE = 0;

    boolean rev = false;
    for (int i = 0; i < Q; i++) {
      if (T[i] == 1) {
        rev = !rev;
      } else {
        if (rev ^ F[i] == 1) {
          pre[preB--] = C[i];
        } else {
          suf[sufE++] = C[i];
        }
      }
    }

    StringBuilder ans = new StringBuilder()
        .append(pre)
        .append(S)
        .append(suf);
    if (rev) ans.reverse();
    System.out.println(ans);
  }
}