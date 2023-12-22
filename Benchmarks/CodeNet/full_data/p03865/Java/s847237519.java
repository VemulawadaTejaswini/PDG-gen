import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String ans = "First";
    int n = s.length();
    if(s.charAt(0) == s.charAt(n - 1)) {
      if((n % 2) == 1) ans = "Second";
    } else {
      if((n % 2) == 0) ans = "Second";
    }
    System.out.println(ans);
  }
}