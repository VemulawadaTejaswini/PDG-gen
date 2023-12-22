import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int Q = sc.nextInt();
    for (int i = 0; i < Q; i++) {
      System.out.println(solve());
    }
  }

  static String solve() {
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt() - 1;
    int D = sc.nextInt() - 1;
    if (A > 10000 || B > 10000) return "";
    char[] ans = new char[A + B];
    int max = Math.max(A, B);
    int min = Math.min(A, B);
    int len = 1;
    while (true) {
      if (len * (min + 1) < max) {
        ++len;
      } else {
        break;
      }
    }
    ArrayList<Integer> cnt = new ArrayList<>();
    boolean rev = B > A;
    if (rev) {
      int tmp = A;
      A = B;
      B = tmp;
    }
//    System.err.println("len:"+ len);
    while (A > 0) {
//      System.err.println("A:" + A + " B:" + B );
      for (int i = Math.min(len, A); i >= 1; i--) {
        if ((A - i) * len < B - len) continue;
        A -= i;
        cnt.add(i);
        if (B > A * len) {
          cnt.add(B - A * len);
          B -= B - A * len;
        } else if (B > 0) {
          cnt.add(1);
          B -= 1;
        }
        break;
      }
    }
    System.err.println(cnt);
    if (rev) {
      int pos = ans.length;
      for (int i = 0; i < cnt.size(); i++) {
        for (int j = 0; j < cnt.get(i); j++) {
          ans[--pos] = i % 2 == 0 ? 'B' : 'A';
        }
      }
    } else {
      int pos = 0;
      for (int i = 0; i < cnt.size(); i++) {
        for (int j = 0; j < cnt.get(i); j++) {
          ans[pos++] = i % 2 == 0 ? 'A' : 'B';
        }
      }
    }
    return String.valueOf(ans, C, D - C + 1);
  }

}
