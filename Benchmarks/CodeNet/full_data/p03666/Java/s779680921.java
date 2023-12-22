import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();
    long D = sc.nextLong();
    long t = Math.abs(A - B);
    String ans = "NO";
    for(long i = 0; i <= N - 1; i++) {
      if((t <= i * D - (N - 1 - i) * C) && (t >= i * C - (N - 1 - i) * D)) ans = "YES";
    }
    System.out.println(ans);
  }
}