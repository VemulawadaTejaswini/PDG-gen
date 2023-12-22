import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int ans = 0;
    int count = 0;
    for (int i = 0; i < s.length() - 1; i++) {
      if (s.charAt(i) == 'A' || s.charAt(i) == 'T' || s.charAt(i) == 'G' || s.charAt(i) == 'C') {
        count++;
        if (s.charAt(i + 1) == 'A' || s.charAt(i + 1) == 'T' || s.charAt(i + 1) == 'G' || s.charAt(i + 1) == 'C') {
          if (i + 1 == s.length() - 1) {
            count++;
            ans = Math.max(count, ans);
            break;
          }
          continue;
        }
        ans = Math.max(count, ans);
        count = 0;
        continue;
      }
      ans = Math.max(count, ans);
      count = 0;
    }
    System.out.println(ans);

  }
}