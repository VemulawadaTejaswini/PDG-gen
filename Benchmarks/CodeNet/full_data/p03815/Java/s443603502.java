import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();

    long ans = 0;

    ans += x/11 * 2;
    x %= 11;

    ans += x/6;
    x %= 6;
    
    ans += x/5;
    if (x%5 != 0) {
      ans++;
    }
    
    System.out.println(ans);
  }
}