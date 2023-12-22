import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] v = new int[n];
    int[] e = new int[100001];
    int[] o = new int[100001];
    for (int i = 0; i < n; i++) {
      v[i] = sc.nextInt();
      if (i % 2 == 0) {
        e[v[i]]++;
      } else {
        o[v[i]]++;
      }
    }
    int e1 = 0;
    int e2 = 0;
    int o1 = 0;
    int o2 = 0;
    for (int i = 1; i <= 100000; i++) {
      if (e[i] > e[e1]) {
        e1 = i;
      }
      if (o[i] > o[o1]) {
        o1 = i;
      }
    }
    for (int i = 1; i <= 100000; i++) {
      if (e[e1] >= e[i] && e[i] > e[e2] && e1 != i) {
        e2 = i;
      }
      if (o[o1] >= o[i] && o[i] > o[o2] && o1 != i) {
        o2 = i;
      }
    }
    if (e1 != o1) {
      int ans = 0;
      for (int i = 0; i < n; i++) {
        if (i % 2 == 0 && v[i] != e1) {
          ans++;
        }
        if (i % 2 == 1 && v[i] != o1) {
          ans++;
        }
      }
      System.out.println(ans);
    } else {
      int ans1 = 0;
      for (int i = 0; i < n; i++) {
        if (i % 2 == 0 && v[i] != e1) {
          ans1++;
        }
        if (i % 2 == 1 && v[i] != o2) {
          ans1++;
        }
      }
      int ans2 = 0;
      for (int i = 0; i < n; i++) {
        if (i % 2 == 0 && v[i] != e2) {
          ans2++;
        }
        if (i % 2 == 1 && v[i] != o1) {
          ans2++;
        }
      }
      System.out.println(Math.min(ans1, ans2));
    }
  }
}