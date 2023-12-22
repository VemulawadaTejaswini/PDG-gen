import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int[] a = new int[10000 + 1];
    for (int i = 0; i < N; i++) {
      a[i] = in.nextInt();
    }
    in.close();

    int cnt = 0;
    while (true) {
      boolean divs = false;
      for (int i = 0; i < N; i++) {
        if (!divs && a[i] % 2 == 0) {
          a[i] /= 2;
          divs = true;
        } else {
          a[i] *= 3;
        }
      }
      if (divs) {
        cnt++;
      } else {
        break;
      }
    }
    System.out.println(cnt);
  }
}
