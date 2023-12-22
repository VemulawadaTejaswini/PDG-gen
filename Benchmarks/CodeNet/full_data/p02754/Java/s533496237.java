import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    long n = Long.parseLong(N);
    String A = sc.next();
    long a = Long.parseLong(A);
    String B = sc.next();
    long b = Long.parseLong(B);
    long buf;
    long rem;
    long ans;

    buf = n / (a + b);
    rem = n - buf * (a + b);
    if(rem > a){
      ans = (buf + 1) * a;
    } else {
      ans = buf * a + rem;
    }
    System.out.println(ans);
  }
}
