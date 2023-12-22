import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] p = new int[n];

    for (int i = 0; i < n; i++) {
      p[i] = sc.nextInt();
    }

    int[] data = new int[n-1];

    for (int i = 0; i < n-1; i++) {
      data[i] = p[i]-p[i+1];
    }

    int c = 1;
    int sum = 0;

    for (int i = 0; i < n-1; i++) {
      if (data[i] >= 0) {
        c++;
      }
    }

    System.out.println(c);

  }

}
