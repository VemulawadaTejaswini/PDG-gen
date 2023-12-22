import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long d = sc.nextLong();
    String ans = "NO";
    long r = (long)(n - 1);
    for(long i = 0; i <= r; i++) {
      long t = i * d - (r - i) * c;
      long s = i * c - (r - i) * d;
      if(((b - a) >= s) && ((b - a) <= t)) ans = "YES";
    }
    System.out.println(ans);
  }
}