package jp.hota.agc038;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] Ps = new int[N];
    for (int i = 0; i < N; i++) {
      Ps[i] = sc.nextInt();
    }

    TreeSet<Integer> sorted = new TreeSet<>();

    int ans = 1;
    for (int i = 0; i < N; i++) {
      int p = Ps[i];

      if (i >= K) {
        int toRemove = Ps[i - K];
        if (toRemove != sorted.first() || sorted.last() > p) {
          ans++;
        }
        sorted.remove(toRemove);
      }

      sorted.add(p);
    }

    System.out.println(ans);
  }
}
