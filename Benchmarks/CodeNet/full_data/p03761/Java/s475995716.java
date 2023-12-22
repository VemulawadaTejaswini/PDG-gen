import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    String[] S = new String[n];
    int[][] count = new int[n][26];
    int[] min = new int[26];
    int[] counts = new int[n];
    int total =0;
    for (int i =0; i<n; i++) {
      S[i] = sc.next();
    }
    for (int i =0; i<n; i++) {
      for (int j =0; j<S[i].length(); j++) {
        char x = S[i].charAt(j);
        count[i][(int)x-97]++;
      }
    }
    for (int i =0; i<26; i++) {
      min[i] = 50;
      for (int j =0; j<n; j++) {
        min[i] = Math.min(count[j][i],min[i]);
      }
      total += min[i];
    }
    if (total == 0) {
      System.out.println("");
    } else {
      System.out.println(total);
    }
  }
}