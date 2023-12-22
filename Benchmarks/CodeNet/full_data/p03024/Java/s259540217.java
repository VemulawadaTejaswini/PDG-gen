import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int p = 15 - s.length();
    for(int i = 0; i < s.length(); i++) {
      if(s.charAt(i) == 'o') p++;
    }
    String ans = "YES";
    if(p < 8) ans = "NO";
    System.out.println(ans);
  }
}