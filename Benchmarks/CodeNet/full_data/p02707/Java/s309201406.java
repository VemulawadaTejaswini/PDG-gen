import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];

    for (int i = 1; i < n; i++) {
      a[i] = sc.nextInt();
    }

    int[] data = new int[n];

    for (int i = 1; i < n; i++) {
      data[a[i]-1]++;
    }

    for (int i = 0; i < n; i++) {
      System.out.println(data[i]);
    }

  }

}
