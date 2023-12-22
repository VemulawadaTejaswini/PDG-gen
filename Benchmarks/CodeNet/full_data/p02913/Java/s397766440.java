import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();

    int max = 0;
    for (int i = 0; i < S.length(); i++) {
      max = Math.max(max(S.substring(i)), max);
    }
    System.out.println(max);
  }

  private static int max(String S) {
    int[] z = new int[S.length()];
    int l = 0;
    int r = 0;
    for (int k = 1; k < S.length(); k++) {
      int j = 0;
      if (k < r) {
        if (z[k - l] < r - k) {
          z[k] = z[k - l];
          continue;
        } else {
          // We know k...r
          j = r - k;
        }
      }
      while (k + j < S.length() && S.charAt(j) == S.charAt(k + j)) {
        j++;
      }
      if (r - l <= j) {
        l = k;
        r = k + j;
      }
      z[k] = j;
    }
    int ans = 0;
    for (int i = 0; i < z.length; i++) {
      ans = Math.max(ans, Math.min(i, z[i]));
    }
    return ans;
  }
}
