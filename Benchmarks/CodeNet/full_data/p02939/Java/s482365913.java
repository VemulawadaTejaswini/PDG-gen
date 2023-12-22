package jp.hota.agc037;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int n = S.length();

    int[] dp = new int[n + 1];
    Map<Integer, HashSet<String>> suffixes = new HashMap<>();
    HashSet<String> set = new HashSet<>();
    set.add("");
    suffixes.put(0, set);
    // Checking i
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j < 4 && i - j >= 0; j++) {
        // Cut at h = i - j.
        int h = i - j;
        String cut = S.substring(h, i);
        if (suffixes.get(h).stream().anyMatch(s -> !s.equals(cut))) {
          int score = dp[h] + 1;

          if (dp[i] > score) {
            continue;
          }

          HashSet<String> suffix = (score > dp[i]) ? new HashSet<>() : suffixes.get(i);
          suffix.add(cut);
          suffixes.put(i, suffix);
          dp[i] = score;
        }
      }
    }
    System.out.println(dp[n]);
  }
}
