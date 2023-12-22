import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n+1];
    int count = 0;

    for (int i = 1; i < n+1; i++) {
      a[i] = sc.nextInt();
    }

    int i = 1;

    while(i < n){
      if (a[i] != i) {
        for (int j = i; j < n; j++) {
          a[j] = a[j+1];
          a[j+1] = 0;
          System.out.println(a[j]);
        }

        count++;
        i = 1;

      } else {
        i++;
      }

      if (a[i] == 0) break;

    }

    if (count == n) {
      System.out.println(-1);
    } else {
      System.out.println(count);
    }

  }
}
