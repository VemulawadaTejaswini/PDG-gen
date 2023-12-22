import java.util.*;
import java.math.*;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long[] h = new long[n];

    for (int i = 0; i < n; i++) {
      h[i] = sc.nextInt();
    }

    Arrays.sort(h);

    long count = 0;

    for (int i = 0; i < n-k; i++) {
      count += h[i];
    }

    System.out.println(count);

  }

}
