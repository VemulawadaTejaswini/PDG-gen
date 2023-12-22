import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] p = new int[n+1];

    for (int i = 1; i < n+1; i++) {
      p[i] = sc.nextInt();
    }

    int c = 0;
    int sum = 0;

    for (int i = 1; i < n+1; i++) {
      c = 0;

      for (int j = 1; j <= i; j++) {
        if (p[i] <= p[j]) {
          c++;
        }
      }

      c = c/i;
      if (c == 1) {
        sum += c;
      }

    }

    System.out.println(sum);

  }

}
