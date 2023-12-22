import java.util.*;
import java.io.*;

class Main {
  int N, len;
  int[] C;
  int[] S;
  int[] F;
  int[] ans;
  public static void main(String[] args) {
    Main m = new Main();
    m.input();
    m.solve();
    m.out();
  }

  public void input() {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    C = new int[N-1];
    S = new int[N-1];
    F = new int[N-1];
    ans = new int[N];
    len = C.length;
    for(int i = 0; i < len; i++) {
      C[i] = sc.nextInt();
      S[i] = sc.nextInt();
      F[i] = sc.nextInt();
    }
  }

  public void solve() {
    int t;
    for(int i = 0; i <= len; i++) {
      ans[i] = 0;
    }
    for(int i = 0; i < len; i++) {
      ans[i] += (S[i] + C[i]);
      for(int j = i + 1; j < len; j++) {
        if(ans[i] <= S[j]) {
          ans[i] = S[j];
          ans[i] += C[j];
        } else {
          t = S[j];
          while(true) {
            if(t < ans[i]) {
              t += F[j];
            } else {
              ans[i] = t;
              break;
            }
          }
          ans[i] += C[j];
        }
      }
    }
  }

  public void out() {
    for(int i = 0; i <= len; i++) {
      System.out.println(ans[i]);
    }
  }
}
