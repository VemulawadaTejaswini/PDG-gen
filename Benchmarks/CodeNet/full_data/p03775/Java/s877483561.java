import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = Long.parseLong(sc.next());
    long j =1, min =N, x =N;
    for (long i =1; i<=Math.sqrt(N); i++) {
      if (N % i == 0) {
        j = N / i;
        x = F(i,j);
        min = Math.min(x,min);
      }
    }
    System.out.println(min);
  }
  
  public static int F(long a, long b) {
    String aa = String.valueOf(a);
    String bb = String.valueOf(b);
    return Math.max(aa.length(),bb.length());
  }
}