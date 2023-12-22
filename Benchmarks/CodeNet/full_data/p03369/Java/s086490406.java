import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] s = sc.next().toCharArray();
    int ans = 700;
    for (char c : s) {
      if (c == 'o') {
        ans += 100;
      }
    }
    
    System.out.println(ans);
  }
}