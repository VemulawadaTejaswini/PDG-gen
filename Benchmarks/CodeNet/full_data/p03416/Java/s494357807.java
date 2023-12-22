import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int ans = 0;
    for (int i = A; i <= B; i++) {
      if (isPalindromic(i)) {
        ans++;
      }
    }
    System.out.println(ans);
  }
  private static boolean isPalindromic(int n) {
    String s = String.valueOf(n);
    for (int i = 0; i < s.length()/2; i++) {
      if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }
}