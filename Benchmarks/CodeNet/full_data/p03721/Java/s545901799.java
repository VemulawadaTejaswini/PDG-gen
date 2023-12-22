import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    long K = sc.nextLong();
    int[] a = new int[N];
    int[] b = new int[N];

    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }

    sc.close();

    long count = 0;

    for (int i = 0; i < N; i++) {
      count += b[i];
      if (K <= count) {
        System.out.println(a[i]);
        break;
      }
    }

  }

}