import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    long ans = 0;
    int wLen = 0;
    for (int i = 0; i < S.length(); i++) {
      if (S.charAt(i) == 'W') {
        ans += i-wLen;
        wLen++;
      }
    }
    
    System.out.println(ans);
  }
}