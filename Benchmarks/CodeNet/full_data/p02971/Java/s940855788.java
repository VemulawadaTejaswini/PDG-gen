import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] data = new int[n];
    int max = 0;

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      data[i] = a[i];
      max = Math.max(max,a[i]);
    }

    Arrays.sort(data);

    for (int i = 0; i < n; i++) {
      if (a[i] != max) {
        System.out.println(max);
      } else {
        System.out.println(data[n-2]);
      }
    }

  }

}
