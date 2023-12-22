import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] S = new String[n];
    for (int i = 0; i < n; i++) {
      S[i] = sc.next();
    }
    int[][] alp = new int[n][26];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < S[i].length(); j++) {
        alp[i][S[i].charAt(j) - 'a']++;
      }
    }
    int[] count = new int[26];
    Arrays.fill(count, Integer.MAX_VALUE);
    for (int i = 0; i < 26; i++) {
      for (int j = 0; j < n; j++) {
        if (alp[j][i] < count[i]) {
          count[i] = alp[j][i];
        }
      }
    }
    String ans = "";
    for (int i = 0; i < 26; i++) {
      int length = count[i];
      for (int j = 0; j < length; j++) {
        ans += Character.toString((char)(i + 'a'));
      }
    }
    System.out.println(ans);
  }
}