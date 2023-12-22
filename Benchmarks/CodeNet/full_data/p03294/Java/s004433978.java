import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];

    long m = 1;

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
      m *= a[i];
    }

    long f = 0;

    for (int i = 0; i < n; i++) {
      f += (m-1)%a[i];
    }

    System.out.println(f);

  }

}
