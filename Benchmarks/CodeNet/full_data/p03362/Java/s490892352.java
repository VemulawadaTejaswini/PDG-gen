import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    int a[] = new int[N];
    boolean flag = true;

    int ind = 0;
    for (int i = 2; i < 1852; i++) {
      flag = false;
      int p = 30 * i + 1;
      for (int j = 2; j < p; j++) {
        if (p % j == 0) {
          flag = true;
          break;
        }
      }
      if (!flag) {
        a[ind] = p;
        ind++;
        if (ind >= N) {
          break;
        }
      }
    }

    for (int i = 0; i < N; i++) {
      System.out.print(a[i] + " ");
    }
  }
}