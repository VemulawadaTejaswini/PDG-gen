import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long ans = 2 * (x / 11);
    long r = (x % 11);
    if(r == 0) {
    } else if(r <= 6) {
      ans++;
    } else {
      ans += 2;
    }  
    System.out.println(ans);
  }
}