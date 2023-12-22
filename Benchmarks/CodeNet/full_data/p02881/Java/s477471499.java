import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long s = n;

    if (n > 1000000000) {
      System.out.println(n-1);
    } else {
      for (long i = 1; i < n; i++) {
        for (long j = 1; j < n; j++) {
          if(i * j == n) {
            s = Math.min(s,i-1+j-1);
            break;
          }
        }
      }
      System.out.println(s);
    }


  }

}
